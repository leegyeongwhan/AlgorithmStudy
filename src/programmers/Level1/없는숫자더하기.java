package programmers.Level1;

import java.util.Arrays;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        boolean[] arr = new boolean[10];

        for (int i = 0; i < numbers.length; i++) {
            arr[numbers[i]] = true;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        없는숫자더하기 m = new 없는숫자더하기();
        m.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
    }
}
