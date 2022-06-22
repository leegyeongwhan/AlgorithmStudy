package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();


        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        System.out.println("<");

        while (!list.isEmpty()) {
            for (int i = 0; i < K; i++) {
                if (i == K - 1) {
                    int a = list.remove();
                  //  System.out.println("a = " + a);
                    if(list.size()==0){
                        System.out.println(a);
                    }
                    else {
                        System.out.print(a+",");
                    }
                }
                else {
                    list.add(list.remove());
                }
            }
        }

//        Queue<Integer> queue = new LinkedList<>();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= N; i++) {
//            queue.add(i);
//        }
//
//        sb.append("<");
//        while (queue.size() > 1) {
//            for (int i = 0; i < K - 1; i++) {
//                int num = queue.poll();
//                queue.offer(num);
//            }
//            sb.append(queue.poll()).append(", ");
//        }
//        sb.append(queue.poll()).append(">");
//        System.out.println(sb);
    }
}
