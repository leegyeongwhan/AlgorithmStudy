package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1969 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int AdenineCnt = 0;
            int ThymineCnt = 0;
            int GuanineCnt = 0;
            int CytosineCnt = 0;
            for (int j = 0; j < N; j++) {

                switch (arr[j].charAt(i)) {  ///배열에 문자열을 담은 후 각 인덱스를 배열의 인덱스들을 탐색
                    case 'A':
                        AdenineCnt++;
                        break;
                    case 'T':
                        ThymineCnt++;
                        break;
                    case 'G':
                        GuanineCnt++;
                        break;
                    case 'C':
                        CytosineCnt++;
                        break;
                }
            }
            int max = maximum4(AdenineCnt, ThymineCnt, GuanineCnt, CytosineCnt);
            char res = checkMaxDna(AdenineCnt, ThymineCnt, GuanineCnt, CytosineCnt, max);
            int result = arr.length - max;
            sum += result;
            sb.append(res);
        }
        System.out.println(sb);
        System.out.println(sum);
        scanner.close();
    }


    // 4가지 유전자중 가장 많이나온 유전자를 체크한다
    public static int maximum4(int num1, int num2, int num3, int num4) {
        int maximum = num1;

        if (num2 >= maximum) {
            maximum = num2;
        }
        if (num3 >= maximum) {
            maximum = num3;
        }
        if (num4 >= maximum) {
            maximum = num4;
        }
        return maximum;
    }

    //가장 큰 숫자가 나온 dna를 찾는다 알파벳은 maximum이같을 때 알파벳 순으로 찍는다
    public static Character checkMaxDna(int AdenineCnt, int ThymineCnt, int GuanineCnt, int CytosineCnt, int maximum) {
        char ch = ' ';
        if (AdenineCnt == maximum) {
            ch = 'A';
        } else if (CytosineCnt == maximum) {
            ch = 'C';
        } else if (GuanineCnt == maximum) {
            ch = 'G';
        } else if (ThymineCnt == maximum) {
            ch = 'T';
        }
        return ch;
    }
}
