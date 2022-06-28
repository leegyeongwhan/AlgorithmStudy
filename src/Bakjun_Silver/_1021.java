package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        st = new StringTokenizer(br.readLine());
        int searchIndex;
        int cnt = 0;

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            //////////////중간의 값을 쉽게 찾으려고 deque 대신 linkedlist를 씀
            //찾으려고 하는 숫자의 인덱스
            searchIndex = deque.indexOf(num);
            if ((deque.size() / 2)  < searchIndex) { //num 이중간본다 뒤에있다는말 즉 뒤로 빼주는게 빠름
                while (true) {
                    if (deque.peekLast() == num) {
                        deque.offerFirst(deque.pollLast());
                        cnt++;
                        break;
                    }
                    deque.offerFirst(deque.pollLast());
                    cnt++;


                }

            } else {  //num이 중간이거나 앞에있음
                while (true) {
                    if (deque.peekFirst() == num) {
                        break;
                    }
                    deque.offerLast(deque.pollFirst());
                    cnt++;


                }

            }
            deque.pollFirst();
        }
        System.out.println(cnt);
    }
}
