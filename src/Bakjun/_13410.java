package Bakjun;

import java.util.*;

public class _13410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        StringBuilder sb;
        int z = 0;

        int max = 0;
        for (int i = 1; i <= K; i++) {
            int value = N * i;
            int reverse = reverseVal(value);
            max = Math.max(reverse, max);
        }


//        for (int i = N; z < K; i++) {
//            for (int j = 1; j <= K; j++) {
//                sb = new StringBuilder();
//                int sum = i * j;
//                sb.append(sum).reverse();
//               // System.out.println(sb);
//                list.add(Integer.parseInt(String.valueOf(sb)));
//                z++;
//            }
//        }
//        System.out.println(Collections.max(list));

    }

    static int reverseVal(int value) {
        int ret = 0;
        while (value > 0) {
            ret *= 10;
            //   System.out.println("ret = " + ret);
            ret += (value % 10);
            value /= 10;
        }
        return ret;
    }
}
