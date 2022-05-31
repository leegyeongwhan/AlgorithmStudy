package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String[] time = str1.split(":");
        String[] waitTime = str2.split(":");
        int[] changeTime = new int[3];


        for (int i = 0; i < 3; i++) {
            changeTime[i] = Integer.parseInt(waitTime[i]) - Integer.parseInt(time[i]);
        }

        if (str1.equals(str2)) {
            System.out.println("24:00:00");
        } else {
            if (changeTime[2] < 0) {
                changeTime[2] += 60;
                changeTime[1]--;
            }
            if (changeTime[1] < 0) {
                changeTime[1] += 60;
                changeTime[0]--;
            }
            if (changeTime[0] < 0) {
                changeTime[0] += 24;
            }
            System.out.format("%02d:%02d:%02d", changeTime[0], changeTime[1], changeTime[2]);
        }
    }
}
