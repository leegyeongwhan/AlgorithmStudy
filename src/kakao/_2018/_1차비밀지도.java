package kakao._2018;


import java.util.Arrays;

/**
 * 1.arr1, arr2 가 십의자리로 들어온다 이걸 2진수로 바꿔보자
 * 그 후 배열에 넣는다
 */
public class _1차비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        int[][] map = new int[n][n];

        for (int i = 0; i < arr1.length; i++) {
            String str = Integer.toBinaryString(arr1[i]);  // 10진수 -> 2진수
            System.out.println(str);
            //1001
            int idx = 0;
            if (str.length() < n) {
                idx = n - str.length();
            }
            for (int j = 0; j < str.length(); j++) {
                map[i][idx + j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        System.out.println(Arrays.deepToString(map));
        return answer;
    }

    public static void main(String[] args) {
        _1차비밀지도 m = new _1차비밀지도();
        m.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }
}
