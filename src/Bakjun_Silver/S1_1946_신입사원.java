package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S1_1946_신입사원 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            List<record> list = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());

                list.add(new record(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }

            MyComparator myComparator = new MyComparator();
            Collections.sort(list, myComparator);

            int cnt = 1;
            int min = list.get(0).b; //1등 면접점수

            for (int k = 1; k < N; k++) {
                if (list.get(k).b < min) { //1등 면접점수등수보다 높으면 통과
                    cnt++;
                    min = list.get(k).b;
                }
            }
            System.out.println(cnt);
        }
    }
}

class MyComparator implements Comparator<record> {
    @Override
    public int compare(record record1, record record2) {
        if (record1.a > record2.a) {
            return 1;
        }
        return -1;
    }
}

class record {
    int a;
    int b;

    public record(int a, int b) {
        this.a = a;
        this.b = b;
    }
}