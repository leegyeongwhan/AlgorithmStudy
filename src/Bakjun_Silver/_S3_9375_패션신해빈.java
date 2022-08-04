package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _S3_9375_패션신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int M = Integer.parseInt(br.readLine());
            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind = st.nextToken();
                    //map 에 모자 , 안경 종류를 개수에 맞게 저장 2개 1개 안입는 경우도 생각해야해서 +1 안입는 경우 즉 둘다 null인경우 를 구하는것
                if (map.containsKey(kind)) {
                    map.put(kind, map.get(kind) + 1);
                } else {
                    map.put(kind, 1);
                }
            }
            int res = 1;
            for (Integer value : map.values()) {
                res *= (value + 1);
            }
            sb.append(res - 1).append('\n');
        }
        System.out.println(sb);
    }
}
