package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class S4_1269_대칭차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aLen = Integer.parseInt(st.nextToken());
        int bLen = Integer.parseInt(st.nextToken());

        HashSet<Integer> aSet = new HashSet<>();
        HashSet<Integer> bSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aLen; i++) {
            aSet.add(Integer.valueOf(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bLen; i++) {
            bSet.add(Integer.valueOf(st.nextToken()));
        }

        HashSet<Integer> chAset = new HashSet<>(aSet);
        HashSet<Integer> chBset = new HashSet<>(bSet);

        chAset.removeAll(bSet);
        chBset.removeAll(aSet);
        int res = 0;
        res += chAset.size();
        res += chBset.size();

        System.out.println(res);
    }
}
