package Question1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lines = line.split(" ");
        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);

        if(m > n || n > 5000) {
            return;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=1 ; i <= n ; i++) {
            queue.add(i);
        }
//
//        for(Integer k : queue) {
//            System.out.print(k + " ");
//        }

        List<Integer> list = new ArrayList<Integer>();

        for(int i=1 ; i <= n ; i++  ) {

            for(int j=1 ; j <= m ; j++) {
                if(j==m) {
                    list.add(queue.poll());
                }else {
                    int temp = queue.poll();
                    queue.add(temp);
                }

            }

        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i=0; i < n ; i++) {
            if(i==n-1) {
                sb.append(list.get(i) + ">");
            } else {
                sb.append(list.get(i) + ", ");
            }
        }

        System.out.println(sb.toString());

    }
}
