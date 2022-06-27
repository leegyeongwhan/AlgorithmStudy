package Bakjun_Silver;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class _1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int bLen = B.length();

        int cnt = 0;
        int minCnt = 0;
        List<Integer> list = new ArrayList<>();
        for (int j = A.length(); j <= bLen; j++) {
            cnt = 0;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    cnt++;
                }
            }
            list.add(cnt);
            B = B.substring(1);
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(0));
    }
}
