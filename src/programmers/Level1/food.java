
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 푸드파이터 {
    public String solution(int[] food) {
        String answer = "";
        String right = "";
        String left = "";

        for (int i = 1; i < food.length; i++) { //346
            if (food[i] != 0) {
                for (int j = 0; j < food[i] / 2; j++) {
                    right += String.valueOf(i);
                    left += String.valueOf(i);
                }
            }
        }
        answer += right;
        for (int i = 0; i < food[0]; i++) {
            answer += "0";
        }
        StringBuilder sb = new StringBuilder(left);
        StringBuilder reverse = sb.reverse();
        answer += reverse;
        return answer;
    }
}
//2 1 3 2
// 0   1322
//  3221
//
