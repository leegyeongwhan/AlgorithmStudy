package ProgrammersStudy.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Knumber {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list ;
        int[] arr;
        for (int i = 0; i < commands.length; i++) {
            arr = array;
            list = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(arr[j]);
              //  System.out.println("array = " + arr[j]);
            }
            Collections.sort(list);
            //System.out.println("list = " + list);
           // System.out.println("(commands[i][2] - 1 = " + (commands[i][2] - 1));
            answer[i] = list.get(commands[i][2] - 1);
            //System.out.println("answer = " + answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }
}
