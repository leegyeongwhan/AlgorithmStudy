package programmers.Lever2;

import java.util.Map;
import java.util.function.BinaryOperator;

public class 이진변환반복하기 {
    public int[] solution(String s) {
        int cnt = 0;
        int sum = 0;
        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    sum++;
                }
            }
            cnt++;
            s = s.replaceAll("0", "");
            int length = s.length();
            String string = Integer.toBinaryString(length);
            s = string;
        }
        int[] answer = new int[2];
        answer[0] = cnt;
        answer[1] = sum;
        return answer;
    }

    public static void main(String[] args) {
        이진변환반복하기 m = new 이진변환반복하기();
        System.out.println(m.solution("110010101001"));
    }
}
