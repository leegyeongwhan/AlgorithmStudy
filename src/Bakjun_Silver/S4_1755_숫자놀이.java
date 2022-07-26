package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class S4_1755_숫자놀이 {
    static String numToString[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] arr = new String[M - N + 1][2];

        int j = 0;
        for (int i = N; i <= M; i++) {
            arr[j][0] = String.valueOf(i);

            if (i < 10) {
                arr[j][1] = numToString[i];
            } else {
                String str = String.valueOf(i);
                String str2 = "";
                for (int k = 0; k < str.length(); k++) {
                    int num = Integer.parseInt(String.valueOf(str.charAt(k)));
                    str2 += numToString[num] + " ";
                }
                arr[j][1] = str2;
            }
            j++;
        }

        //  System.out.println(Arrays.deepToString(arr));

        Arrays.sort(arr, new Comparator<String[]>() {

            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[1].toString().compareTo(o2[1].toString());
            }
        });
        //System.out.println(Arrays.deepToString(arr));
        for(int i=0;i< arr.length;i++) {
            if(i!=0 && i%10 == 0) System.out.println();
            System.out.print(arr[i][0]+" "); //출력 10개씩!
        }
    }
}
