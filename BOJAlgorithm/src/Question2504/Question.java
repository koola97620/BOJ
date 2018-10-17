package Question2504;

/*
    괄호의 값.
    https://www.acmicpc.net/problem/2504
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = "(()[[]])([])";
        String input2 = "[[]]";

        char[] ch = input.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        //stack.push(ch[0]);

        List<String> list = new ArrayList<String>();

        int result =0;
        int temp = 0;
        int depth=0;

        list.add("(");

        for(int i=0; i < ch.length ; i++) {
//
//            if(i != 0 && stack.isEmpty()) {
//                stack.push(ch[i]);
//                continue;
//            }


            if(ch[i] == '(' || ch[i] == '[') {
                stack.push(ch[i]);
            } else if(stack.peek() == '(' && ch[i] == ')') {
                // 닫아주기 + 닫아주기 = 곱
                // 닫아주기 + 열어주기 = 합
                stack.pop();
                list.add("2");
                depth--;

                if(i == ch.length -1) {
                    list.add(")");
                    break;
                }

                if(ch[i+1] == '(') {
                    list.add("+");
                    list.add("(");
                    result = result + temp;
                    temp = 0;
                } else if(ch[i+1] == '[') {
                    list.add("+");
                    list.add("(");
                    result = result + 2;
                } else if(ch[i+1] == ')') {
                    list.add("*");
                    list.add(")");
                    result = result *3;
                } else if(ch[i+1] == ']') {
                    list.add("*");
                    list.add(")");
                    result = result *3;
                }


            } else if(stack.peek() == '[' && ch[i] == ']') {
                // 닫아주기 + 닫아주기 = 곱
                // 닫아주기 + 열어주기 = 합
                stack.pop();
                list.add("3");


                if(i == ch.length -1) {
                    // 제일 마지막에 붙이는 괄호.
                    list.add(")");
                    break;
                }

                if(ch[i+1] == '(' || ch[i+1] == '[') {
                    list.add("+");
                } else if(ch[i+1] == ')' || ch[i+1] == ']') {
                    list.add("*");

                }

            } // end else if

            if(stack.isEmpty()) {

            }



        } // end for

        for(String str : list) {
            System.out.print(str + "  ");
        }

    }
}
