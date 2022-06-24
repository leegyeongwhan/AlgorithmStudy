package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            String num = String.valueOf(i);
            //핵심은 숫자로 포켓몬을 부르고 포케몬으로 숫자를 부르는 것
            /////포케몬은 중복이 없으니 숫자 포켓몬,, 포케몬 ,,숫자 두번만들자
            map.put(num, str);
            map.put(str, num);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append(map.get(st.nextToken())).append("\n");
        }
        System.out.println(sb);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < M; i++) {
//            st = new StringTokenizer(br.readLine());
//            String str = st.nextToken();
//            char tmp;
//            boolean check = true;
//            for (int j = 0; j < str.length(); j++) {
//                tmp = str.charAt(j);
//                if (!Character.isDigit(tmp)) {  //숫자인지 여부 체크
//                    check = false;
//                }
//            }
//            if (check == true) {     //숫자면 알파벳 알파벳이면 숫자를 출력
//                System.out.println( map.get(Integer.parseInt(str)));
//            }else {
//                int findKey =0;
//                for(int key : map.keySet()) {
//                    if(map.get(key).equals(str)) {
//                        findKey = key;
//                        System.out.println(findKey);
//                        break;
//                    }
//                }
//            }
//        }

    }
}
