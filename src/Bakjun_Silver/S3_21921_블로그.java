package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_21921_블로그 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 1;
        int max = 0;
        //처음 수
        for (int i = 0; i < X; i++) {
            sum += arr[i];
        }

        max = sum; //처음 방문한 숫자
        //슬라이딩 윈도우
        for (int i = X; i < N; i++) {
            sum -= arr[i - X]; //맨 왼쪽 빼주기
            sum += arr[i]; //한칸 오른쪽 더해주기

            if (max < sum) {
                cnt = 1;
                max = sum;
            } else if (max == sum) {
                cnt++;
            }
        }

        if (max == 0) {
            System.out.println("SAD");
            return;
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
