package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _S3_14425_문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        String[] arr1 = new String[N];
        String[] arr2 = new String[M];

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 0);
        }
        int cnt =0;
        for (int i = 0; i < M; i++) {
            if(map.containsKey(br.readLine())){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
