package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        HashSet<String> setN = new HashSet<>();
        HashSet<String> setM = new HashSet<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            setN.add(st.nextToken());
        }


        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            setM.add(st.nextToken());
        }
//        System.out.println("setN = " + setN);
//        System.out.println("setM = " + setM);
        setN.retainAll(setM);
        List<String> list = new ArrayList<>(setN);
        Collections.sort(list);

        System.out.println(list.size());
        for (String s : list){
            System.out.println(s);
        }

//
//        import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.StringTokenizer;
//
//        public class Main {
//            private static final String SPACE = " ";
//            private static final String NEW_LINE = "\n";
//
//            public static void main(String[] args) throws Exception {
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//                StringTokenizer st = new StringTokenizer(br.readLine(), SPACE);
//                int N = Integer.parseInt(st.nextToken()); // didn't hear
//                int M = Integer.parseInt(st.nextToken()); // didn't see
//
//                String[] notSH = new String[N+M];
//
//                for(int i = 0; i < N + M; i++){
//                    notSH[i] = br.readLine();
//
//                }
//                Arrays.sort(notSH);
//
//                int cnt = 0;
//
//                StringBuilder sb = new StringBuilder();
//                for(int i = 1; i < N + M; i++){
//                    if(notSH[i].equals(notSH[i - 1])){
//                        sb.append(notSH[i]).append(NEW_LINE);
//                        cnt++;
//                    }
//                }
//                System.out.println(cnt);
//                System.out.println(sb.toString());
//            }
//        }

    }
}
