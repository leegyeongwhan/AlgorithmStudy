package programmers.Lever2;

import java.util.Arrays;

public class 최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split(" ");
        Integer[] arr = new Integer[split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(split[i]);
        }
        Arrays.sort(arr);
        answer += arr[0] + " ";
        answer += arr[split.length - 1];
        return answer;
    }

    public static void main(String[] args) {
        최댓값과최솟값 m = new 최댓값과최솟값();
        System.out.println(m.solution("-1 -2 -3 -4"));
    }
}
