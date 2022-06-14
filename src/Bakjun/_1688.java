package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] troPhy = new int[n];
        int top = 0;  // 트로피를 비교해줄 값 다음트로피가 더크면 플러스를 해주지 않는다.
        int leftCnt = 0;     //왼쪽값
        int rightCnt = 0;    //오른쪽값

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            troPhy[i] = num;

            if (top < troPhy[i]) {
                top = troPhy[i];
                leftCnt++;
            }
        }

        top = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (top < troPhy[i]) {
                top = troPhy[i];
                rightCnt++;
            }
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        sb.append(leftCnt).append("\n").append(rightCnt);
        System.out.println(sb);
    }
}
