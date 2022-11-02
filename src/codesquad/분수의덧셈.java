package codesquad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 완전탐색
 */
public class 분수의덧셈 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        denum1 = denum1 * num2;
        denum2 = denum2 * num2;

        answer = new int[]{denum1 + denum2, num1 * num2};

        int greatest_common_divisor = GCD(answer[0], answer[1]);
        answer[0] /= greatest_common_divisor;
        answer[1] /= greatest_common_divisor;

        return answer;
    }

    public static void main(String[] args) {
        분수의덧셈 s = new 분수의덧셈();
        System.out.println(Arrays.toString(s.solution(1, 2, 3, 4)));
    }

    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return GCD(num2, num1 % num2);
    }
}
