package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 좌우로 와따리 가따리 해야한다.
/*
 항상 분리해서 생각하자 사과가 떨어지는 경우는 3가지다
 1.그대로 2.왼쪽 으로 3.오른쪽으로
 */
public class _2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int appleLen = Integer.parseInt(br.readLine());


        int cnt = 0;
        int left = 1;
        int right = M;

        for (int i = 0; i < appleLen; i++) {
            int apple = Integer.parseInt(br.readLine());    //1 5 3

            //오른쪽 //왼쪽 //그대로 M을 바꾸니의 크기라 생각하자!!!! 바구니에 사과를 담는 것이다

            if (apple >= left && apple <= right) {
                continue;
            } else if (apple < left) {  //  왼쪽
                cnt += left - apple;
                right -= left - apple;
                left = apple;
            } else if (apple > right) {  // 오른쪽
                cnt += apple - right;
                left += apple - right;
                right = apple;
            }
        }
        System.out.println(cnt);
    }
}
