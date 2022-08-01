package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1075_나누기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        n = (n / 100) * 100;
        while (n % m != 0) {
            n++;
            n %= 100;
            if(n < 10) System.out.println("0" + n);
            else System.out.println(n);
        }
    }
}
