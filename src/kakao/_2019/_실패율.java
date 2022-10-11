package kakao._2019;

import Bakjun.A;

import java.util.*;

public class _실패율 {
    public int[] solution(int N, int[] stages) {
        int len = stages.length;
        Map<String, Double> map = new HashMap<>();
        int[] userFailcnt = new int[N + 2];

        int man = len;
        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 0; j < len; j++) {
                if (i == stages[j]) {
                    stages[j] = 0;
                    //실패한 사람수
//                          System.out.println("stage" + i);
//                          System.out.println(Arrays.toString(stages));
                    //     System.out.println();
                    cnt++;
                }
            }
//              System.out.println("cnt" + cnt);
//               System.out.println("man" + man);
            double fail = (double) cnt / (man);
            man -= cnt;
//              System.out.println("cagne " +man);
//              System.out.println("fail" + fail);
            map.put("" + i, fail);
        }

//        for (Float value : map.values()) {
//            System.out.print(value + " ");
//        }
        System.out.println();
        List<String> listKeySet = new ArrayList<>(map.keySet());
        Collections.sort(listKeySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));

        int[] arr = listKeySet.stream()
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();
        return arr;
    }

    public static void main(String[] args) {
        _실패율 a = new _실패율();
        System.out.println(Arrays.toString(a.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
    }
}
