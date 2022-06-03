package Inflean;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    ArrayList<String> solution(String[] arr) {
        ArrayList<String> list = new ArrayList<String>();
        for (String s : arr) {
            char[] chArr = s.toCharArray();
            int len = chArr.length - 1;
            for (int i = 0; i < chArr.length / 2; i++) {
                char tmp = chArr[i];
                chArr[i] = chArr[len];
                chArr[len] = tmp;
                len--;
            }
            list.add(String.valueOf(chArr));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Main t = new Main();
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            String str = scanner.next();
            arr[i] = str;
        }
        for (String x : t.solution(arr)) {
            System.out.println(x);
        }

    }
}
