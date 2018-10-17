package Question2504;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class QuestionRe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "(()[[]])([])";
//        String input2 = "([])";
//        String input3 = "(()[[]])";
//        String input ="(()()[])";

        //String input = sc.next();
        //char[] ch = input2.toCharArray();
        String[] strs = input.split("");
        Stack<String> stack = new Stack<String>();

        int ptr=0;
        int result =0;
        int temp = 0;

        // ch[ptr]
        while(ptr < strs.length) {

            if(strs[ptr].equals("(") || strs[ptr].equals("[")) {
                stack.push(strs[ptr]);
                ptr++;
                continue;
            }
//            if(stack.peek().equals("(") && strs[ptr].equals("]")) {
//                System.out.println(0);
//                return;
//            }else if(stack.peek().equals("[") && strs[ptr].equals(")")) {
//                System.out.println(0);
//                return;
//            }


            if(stack.peek().equals("(") && strs[ptr].equals(")") ) {
                stack.pop();
                stack.push("2");

                // 2 푸쉬 전에 스택 맨위가 숫자면! 더해줘라!.
//                if(!stack.peek().equals("(")  || !stack.peek().equals("[") || !stack.peek().equals(")")  || !stack.peek().equals("]")) {
//                    temp = Integer.parseInt(stack.pop()) + 2;
//                    stack.push(String.valueOf(temp));
//                    temp =0;
//                }

            } else if(stack.peek().equals("[")  && strs[ptr].equals("]") ) {
                stack.pop();
                stack.push("3");

//                if(!stack.peek().equals("(")  || !stack.peek().equals("[") || !stack.peek().equals(")")  || !stack.peek().equals("]")) {
//                    temp = Integer.parseInt(stack.pop()) + 3;
//                    stack.push(String.valueOf(temp));
//                    temp =0;
//                }

            }
            else if(!stack.peek().equals("(")  || !stack.peek().equals("[") || !stack.peek().equals(")")  || !stack.peek().equals("]") ) {
                // 스택의 꼭대기가 숫자이면!!!?!??

                temp = Integer.parseInt(stack.pop());

                if(stack.peek().equals("(") ) {
                    stack.pop();
                    temp = temp * 2;

                    if(stack.isEmpty() && ptr == strs.length -1) {
                        result = result + temp;
                        temp =0;
                        break;
                    } else if(stack.isEmpty() && ptr != strs.length -1) {
                        result = result + temp;
                        temp =0;
                        ptr++;
                        continue;
                    }

                    // peek() 가 숫자이면.??
                    if(!stack.peek().equals("(")  || !stack.peek().equals("[") || !stack.peek().equals(")")  || !stack.peek().equals("]")) {
                        temp = temp + Integer.parseInt(stack.pop());
                        stack.push(String.valueOf(temp));
                        temp =0;
                    } else {
                        stack.push(String.valueOf(temp));
                        temp =0;
                    }

                } else if(stack.peek().equals("[") ) {
                    stack.pop();
                    temp = temp * 3;

                    if(stack.isEmpty() && ptr == strs.length -1) {
                        result = result + temp;
                        temp =0;
                        break;
                    } else if(stack.isEmpty() && ptr != strs.length -1) {
                        result = result + temp;
                        temp =0;
                        ptr++;
                        continue;
                    }

                    // peek() 가 숫자이면.??
                    if(stack.peek() != "(" || stack.peek() != "[" || stack.peek() != ")" || stack.peek() != "]") {
                        temp = temp + Integer.parseInt(stack.pop());
                        stack.push(String.valueOf(temp));
                        temp =0;
                    } else {
                        stack.push(String.valueOf(temp));
                        temp=0;
                    }

                }  // end else if

            } // end else if

            print(stack);

            ptr++;
        } //while

        if(!stack.isEmpty()) {
            System.out.println(0);
            return;
        }

        System.out.println(result);



    }

    public static void print(Stack<String> st) {
        Iterator itr = st.iterator();
        while(itr.hasNext()) {
            System.out.print((String)itr.next() + " ");
        }
        System.out.println();
    }



}
