package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B2_1076_저항 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        Map<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);

        String answer = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(str1)) {
                answer += entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(str2)) {
                answer += entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(str3)) {
                Integer value = entry.getValue();
                double pow = Math.pow(10, value);
                System.out.println(Integer.parseInt(answer) * (long) pow);
                return;
            }
        }
    }
}
