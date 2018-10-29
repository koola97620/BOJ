package Question1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lines = line.split(" ");
        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);

        if(m > n || n > 5000) {
            return;
        }

        // 세팅.
        for(int i=1;  i <= n ; i++) {
            q1.add(i);
        }
        //System.out.println(q1);


        int ptr = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        List<Integer> result = new ArrayList<Integer>();

        while(!q1.isEmpty()) {

            if(ptr == m) {
                //sb.append(q1.poll()+", ");
                result.add(q1.poll());
                ptr=1;
                // poll 하자마자 q1에 값이 안남아 있는경우.
                // q2에만 값이 있다.
                if(q1.isEmpty()) {
                    while(!q2.isEmpty()) {
                        // m 이 홀수인 경우.
                        if(m % 2 == 1) {
                            result.add(q2.poll());
                        } else {
                            int temp = q2.poll();
                            result.add(q2.poll());
                            result.add(temp);
                        }
                    }
                }
                while(!q1.isEmpty()) {
                    q2.add(q1.poll());
                    // 처음 3 빼고 q1에는 1 2 4 5 6 7 이 있다. q1에 아무것도 없으면.
                    // 1,2 를 뒤로 보내준다. 4 5 6 7 1 2 로 만들기.
                    if(q1.isEmpty()) {
                        for(int i=0; i < m-1 ; i++) {
                            q2.add(q2.poll());
                        }
                    }
                }
                while(!q2.isEmpty()) {
                    q1.add(q2.poll());
                }
                // 이제 q1에 4 5 6 7 1 2 이 있다.
//                System.out.println(q1);

            } else {
                q2.add(q1.poll());
                ptr++;
            }

        }
//
//        while(q2.size() > 0) {
//            sb.append(q2.poll());
//            if(q2.isEmpty()) {
//                sb.append(">");
//            } else {
//                sb.append(", ");
//            }
//        }
        for(int i=0; i < n; i++) {

            if(i == n-1) {
                sb.append(result.get(i) + ">");
            } else {
                sb.append(result.get(i) + ", ");
            }
        }

        System.out.print(sb.toString());


    }
}