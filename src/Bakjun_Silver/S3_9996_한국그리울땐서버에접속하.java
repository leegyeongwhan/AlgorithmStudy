package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_9996_한국그리울땐서버에접속하 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int index_byul = str.indexOf("*");
        String start = str.substring(0, index_byul);
        //     System.out.println("start = " + start);

        String end = str.substring(index_byul + 1);

        //    System.out.println("end = " + end);
        StringBuilder sb = new StringBuilder();
        int str_len = str.length();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            /////////이부분에서 계속틀렸다
            if (input.length() < str.length() - 1) {
                sb.append("NE").append("\n");
                continue;
            }

            String startStr = input.substring(0, start.length());
            String endtStr = input.substring(input.length() - end.length());
            //   System.out.println("inputStr = " + startStr);
            //        System.out.println(endtStr);

            if (start.equals(startStr) && end.equals(endtStr)) {
                sb.append("DA").append("\n");
            } else {
                sb.append("NE").append("\n");
            }
        }
        System.out.println(sb);
    }
}
