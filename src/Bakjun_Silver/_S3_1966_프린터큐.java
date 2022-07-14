package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _S3_1966_프린터큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int a = Integer.parseInt(st.nextToken());
                queue.offer(new int[]{j, a}); //중요도,초기위치
            }
//            for (int[] ints : queue) {
//                System.out.print(Arrays.toString(ints));
//            }
//            System.out.println();
            int cnt = 0;
            while (!queue.isEmpty()) {
                int[] front = queue.poll();  //첫번 쨰원소가 가장 큰지 체크
                //   System.out.println("Arrays.toString(front) = " + Arrays.toString(front));
                boolean flag = true;
                //맨앞의 front 보다 중요도가 큰게있는지 체크 큰게있다면?
                for (int j = 0; j < queue.size(); j++) {
                    if (front[1] < queue.get(j)[1]) { //4

                        queue.offer(front);
                        for (int z = 0; z < j; z++) {
                            queue.offer(queue.poll());
                        }
                        ///중요도가 front보다 크면 false
                        flag = false;
                        break;
                    }
                }

                //가장큰 원소가 아니라면
                if (flag == false) {
                    continue;
                }

                //가장큼 프론트가
                cnt++;

                if (front[0] == M) {
                    break;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
