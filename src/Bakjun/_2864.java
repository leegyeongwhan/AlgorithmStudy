package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        String maxAStr = A.replace('5', '6');
        String maxBStr = B.replace('5', '6');

        int max = Integer.parseInt(maxAStr) + Integer.parseInt(maxBStr);

        String minAStr = A.replace('6', '5');
        String minBStr = B.replace('6', '5');

        int min = Integer.parseInt(minAStr) + Integer.parseInt(minBStr);

        System.out.println(min + " " + max);
    }
}
