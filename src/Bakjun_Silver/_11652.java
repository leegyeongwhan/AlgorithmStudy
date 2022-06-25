package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

public class _11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Long> list = new ArrayList<>();
        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            list.add(num);
        }
        list.sort(Comparator.naturalOrder());

        //list를 set으로

        for (Long item : list) {
            Long num = item;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        ArrayList<Integer> list1 = new ArrayList<>(map.values());
        for (Integer val : list1) {
            if (max < val) {
                max = val;
            }
        }

        //  System.out.println(map);
//작은 숫자가 먼저 출력
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();

        for (Long key : map.keySet()) {
            //  System.out.println(map.get(key));
            if (max == map.get(key)) {
                priorityQueue.add(key);
            }
        }


        System.out.println(priorityQueue.peek());
    }
}
