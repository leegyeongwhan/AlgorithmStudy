package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class _10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        list.sort(Comparator.reverseOrder());
    //    System.out.println(list);

        //조건 두가지 1,30을 소인수 분해하면 2, 5 ,3 2*5 = 10 끝이 0이냐?
        //           2, 자릿수의 합이 3으로 나눠지냐?

        int zeroCnt = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                zeroCnt++;
            }
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        if (zeroCnt == 0) {
            System.out.println("-1");
            return;
        } else if (sum % 3 != 0) {
            System.out.println("-1");
            return;
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
        }

    }
}
