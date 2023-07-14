package kakao._2022;

import java.util.ArrayDeque;
import java.util.Deque;

//탈출 조건이 어려웟다
public class 두큐합같게만들기 {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum = 0;
        long a = 0;
        long b = 0;
        for (int i : queue1) {
            a += i;
        }
        for (int i : queue2) {
            b += i;
        }

        sum = (a + b);

        Deque<Integer> queueA = new ArrayDeque<>();
        Deque<Integer> queueB = new ArrayDeque<>();
        for (Integer element : queue1) {
            queueA.offer(element);
        }

        for (Integer element : queue2) {
            queueB.offer(element);
        }

        if (sum % 2 != 0) {
            return -1;
        }

        int flagA = 0;
        int flagB = 0;

        while (flagA <= queue2.length * 3 && flagB <= queue2.length * 3) {
            if (a == b) {
                return flagA + flagB;
            }

            if (a > sum / 2) {
                Integer poll = queueA.pollFirst();
                queueB.offerLast(poll);
                a = a - poll;
                b += poll;
                flagA++;

            } else if (b > sum / 2) {
                Integer poll = queueB.pollFirst();
                queueA.offerLast(poll);
                b = b - poll;
                a += poll;
                flagB++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        두큐합같게만들기 s = new 두큐합같게만들기();
        int[] a = {3, 2, 7, 2};
        int[] b = {4, 6, 5, 1};
        s.solution(a, b);
    }
}
