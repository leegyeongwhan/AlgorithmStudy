package kakao._2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 튜플 {
    public int[] solution(String s) {
        s = stringSubstring(s);
        // System.out.println(s);
        s = stringReplace(s);
        // System.out.println(s);
        String[] arr = s.split("_");
//        for (String s1 : arr) {
//            System.out.println(s1);
//        }
        arrySort(arr);

     //   System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String[] split = arr[i].split(",");
            // System.out.println(Arrays.toString(split));
            for (int j = 0; j < split.length; j++) {
                int n = Integer.parseInt(split[j]);
                if (!list.contains(n)) {
                    list.add(n);
                }
            }
        }
    //    System.out.println(list);

        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    private String stringReplace(String s) {
        return s.replace("},{", "_");
    }

    private String stringSubstring(String s) {
        s = s.substring(2);
        s = s.substring(0, s.length() - 2);
        return s;
    }

    private void arrySort(String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
    }

    public static void main(String[] args) {
        튜플 s = new 튜플();
        System.out.println(s.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"));
    }
}
