package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2490 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < 3) {
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            int frontCnt = 0;
            //int backCnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("1")) {
                    frontCnt++;
                }
            }
        //    System.out.println(frontCnt);
            switch (frontCnt) {
                case 1:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                case 4:
                    System.out.println("E");
                    break;
                default:
                    System.out.println("D");
                    break;
            }
            i++;
        }

    }


}
