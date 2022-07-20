package Bakjun;

import java.util.*;

public class _B1_1371_가장많은글자 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int alpha[] = new int[26];
        int max = 0;
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) != ' '){
                    alpha[str.charAt(i) - 'a']++;
                    if(max < alpha[str.charAt(i) - 'a']){
                        max = alpha[str.charAt(i) - 'a'];
                    }
                }
            }
        }

        for(int i = 0; i < 26; i++){
            if(alpha[i] == max){
                System.out.print((char)(i + 'a'));
            }
        }
        sc.close();
    }
}