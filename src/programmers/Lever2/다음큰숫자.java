package programmers.Lever2;


/***
 *  bitcount()를 이용하면 쉽게 구할 수있따
 */
public class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        String binaryString = Integer.toBinaryString(n);
        int sum = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                sum += 1;
            }
        }
        n += 1;
        while (true) {
            int sum2 = 0;
            String binaryString2 = Integer.toBinaryString(n);
            for (int i = 0; i < binaryString2.length(); i++) {
                if (binaryString2.charAt(i) == '1') {
                    sum2 += 1;
                }
            }

            if (sum == sum2) {
                return Integer.parseInt(binaryString2, 2);
            }
            n++;
        }
    }

    public static void main(String[] args) {
        다음큰숫자 m = new 다음큰숫자();
        System.out.println(m.solution(78));
    }
}

/**
 * while (true) {
 * if (n == 0 || n == 1) {
 * sb.append(n % 2);
 * break;
 * }
 * sb.append(n % 2);
 * n /= 2;
 * }
 */