package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = {'U', 'C', 'P', 'C'};
        String str = br.readLine();

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == arr[index]) {
                index++;
            }
            if (index == 4) {
                System.out.println("I love UCPC");
                return;
            }
        }
        System.out.println("I hate UCPC");
    }
}
