package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int num = Integer.parseInt(st.nextToken());
//            String str = st.nextToken();
//
//            for (int j = 0; j < str.length(); j++) {
//                if (j != num - 1) {
//                    sb.append(str.charAt(j));
//                }
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);


        for(int i=0; i<n; i++) {
            String S = br.readLine();
            String arr[] = S.split(" ");

            System.out.println(Arrays.toString(arr));
            int pos = Integer.parseInt(arr[0]);
            String result;
            if(pos!=arr[1].length())
                result = arr[1].substring(0,pos-1)+arr[1].substring(pos);
            else
                result = arr[1].substring(0,pos-1);
            System.out.println(result);
        }

        br.close();
    }
}
