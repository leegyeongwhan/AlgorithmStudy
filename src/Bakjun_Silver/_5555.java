package Bakjun_Silver;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class _5555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        //  List<String> list = new LinkedList<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String st = br.readLine();

            st += st;
            if (st.contains(str)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
