package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S2_4358_생태학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        int mapSize = 0;

        while (true) {
            String input = br.readLine();
            if (input == null || input.equals("")) {
                break;
            }

            if (!map.containsKey(input)) {
                map.put(input, 1);
            } else {
                int num = map.get(input);
                map.put(input, num + 1);
            }
            mapSize++;
        }

        List<String> keyList = new ArrayList<>(map.keySet());
        keyList.sort((s1, s2) -> s1.compareTo(s2));

        StringBuilder sb = new StringBuilder();
        for (String key : keyList) {
            double per = (double) (map.get(key) * 100.0) / mapSize;
            sb.append(key + " " + String.format("%.4f", per) + "\n");
        }
        System.out.println(sb);
    }
}
