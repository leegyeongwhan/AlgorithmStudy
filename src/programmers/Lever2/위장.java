package programmers.Lever2;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        //조합 공식 nCr= nPr/rPr
        //안입는 경우도 조합에서 계산해준다 // 스파이가 뭐하나라도 입어야한다
        int res = 1;
        for (Integer value : map.values()) {
            res *= value + 1;
        }
        return res - 1;
    }
}
