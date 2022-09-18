package kakao._2018;


import java.util.Arrays;

/**
 * 1.arr1, arr2 가 십의자리로 들어온다 이걸 2진수로 바꿔보자
 * 그 후 배열에 넣는다
 */
public class _1차비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            String str1 = getToBinaryString(arr1[i], n);  // 10진수 -> 2진수
            String str2 = getToBinaryString(arr2[i], n);  // 10진수 -> 2진수
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '1' || str2.charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    private String getToBinaryString(int idx, int num) {
        String binary = Integer.toBinaryString(idx);
        int len = binary.length();
        for (int i = 0; i < num - len; i++) {
            binary = "0" + binary;
        }
        return binary;
    }

    public static void main(String[] args) {
        _1차비밀지도 m = new _1차비밀지도();
        m.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }
}
