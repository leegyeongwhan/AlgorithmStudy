package Bakjun;

import java.util.Scanner;

public class _2789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String cambridge = "CAMBRIDGE";
        char[] cambrige = cambridge.toCharArray();

        for (int i = 0; i < cambrige.length; i++) {
            if (str.indexOf(cambrige[i]) > -1) {
                str = str.replace(String.valueOf(cambrige[i]), "");
            }
        }
        System.out.println(str);

//        char[] charr = cambridge.toCharArray();
//        StringBuffer sb = new StringBuffer();
//        StringBuffer s = new StringBuffer();
//
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < cambridge.length(); j++) {
//                if (str.charAt(i) == cambridge.charAt(j)) {
//                    s.append(cambridge.charAt(j));
//                }
//            }
//        }
////        System.out.println(s);
////        System.out.println(sb);
//        //str 오리지날 문자 // s제거해야할 문자
//        for (int i = 0 ; i<s.length(); i++){
//            String c = String.valueOf(s.charAt(i));
//            str = str.replace(c, "");
//        }
//        System.out.println(str);


    }
}
