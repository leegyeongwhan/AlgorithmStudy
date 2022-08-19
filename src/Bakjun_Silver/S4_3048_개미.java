package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_3048_개미 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        String strA = br.readLine();
        String strB = br.readLine();
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        strA = String.valueOf(sb.append(strA).reverse());


        Ant[] arrA = new Ant[a];
        Ant[] arrB = new Ant[b];

        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = new Ant(1, String.valueOf(strA.charAt(i)));

        }

        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = new Ant(-1, String.valueOf(strB.charAt(i)));
        }

//        System.out.println(Arrays.toString(arrA));
//        System.out.println(Arrays.toString(arrB));
        Ant[] sumArr = new Ant[a + b];
        System.arraycopy(arrA, 0, sumArr, 0, a);
        System.arraycopy(arrB, 0, sumArr, a, b);
      //  System.out.println(Arrays.toString(sumArr));

        //그룹 A인지 B인지 구분 해줘야한다.
        Ant[] end = sumArr;

        for (int i = 0; i < n; i++) {
            Ant[] cur = end.clone();

            for (int j = 0; j < sumArr.length - 1; j++) {
                if (cur[j].dir == 1 && cur[j + 1].dir == -1) {
                    //swap
                    Ant tmp = cur[j];
                  //  System.out.println(tmp);
                    end[j] = cur[j + 1];
                    end[j + 1] = tmp;
                }
                else {
                    continue;
                }
            }
        }
        for (Ant ant : sumArr) {
            System.out.print(ant.alphabet);
        }
    }
}

class Ant {
    int dir;
    String alphabet;

    public Ant(int dir, String alphabet) {
        this.dir = dir;
        this.alphabet = alphabet;
    }

    @Override
    public String toString() {
        return "Ant{" +
                "dir=" + dir +
                ", alphabet=" + alphabet +
                '}';
    }
}
