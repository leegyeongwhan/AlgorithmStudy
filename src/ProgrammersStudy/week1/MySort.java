package ProgrammersStudy.week1;

import java.util.*;

public class MySort {
    public static void main(String[] args) {

        solution(new String[]{"abce", "abcd", "cdx"}, 2);
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = strings;

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) {
                    return 1;
                } else if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);  //같으면 단어자체를 사전순으로
                } else if (o1.charAt(n) < o2.charAt(n)) {
                    return -1;
                }
                return 0;
            }
        });

//        for (int i = 0; i < strings.length; i++) {
//            for (int j = i + 1; j < strings.length; j++) {
//                if (strings[i].charAt(n) > strings[j].charAt(n)) {
//                    String tmp = strings[i];
//                    strings[i] = strings[j];
//                    strings[j] = tmp;
//                }
//                if (strings[i].charAt(n) == strings[j].charAt(n)) {
//
//                }
//            }
//        }

        return answer;
    }
}
