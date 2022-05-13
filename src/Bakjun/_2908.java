package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2908 {
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    Scanner scanner = new Scanner(System.in);
//
//    String num1 = scanner.next();
//    String num2 = scanner.next();
//
//    StringBuffer sb = new StringBuffer(num1);
//    StringBuffer sb2 = new StringBuffer(num2);
//    int num3 = Integer.parseInt(String.valueOf(sb.reverse()));
//    int num4 = Integer.parseInt(String.valueOf(sb2.reverse()));
//
//    int max = 0;
//    if (num3 > num4) {
//      max = num3;
//    } else {
//      max = num4;
//    }
//    System.out.println(max);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
    int b;
    StringBuffer sb = new StringBuffer(st.nextToken());
    b = Integer.parseInt(sb.reverse().toString());

    System.out.println(a > b ? a : b);
  }
}
