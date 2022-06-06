package Bakjun_Silver;

import java.lang.reflect.Array;
import java.util.*;

public class _11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            map.put(i, time);
        }
        //map는 sort기능이없어 list에 넣어주고 value값을 정렬해준다
        List<Integer> list = new ArrayList<Integer>(map.keySet());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        int sum = 0;
        int prevSum = 0;

        for (int i = 0; i < list.size(); i++) {
                prevSum += map.get(list.get(i));
                sum += prevSum;
        }
        System.out.println(sum);
    }
}
