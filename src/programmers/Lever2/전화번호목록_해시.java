package programmers.Lever2;

import java.util.Arrays;

/**
 * 정렬을 함으로서 조건이 많이 줄어든다
 */
public class 전화번호목록_해시 {
    public boolean solution(String[] phone_book) {
        int len = phone_book.length;
        Arrays.sort(phone_book);

        for (int i = 0; i < len - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        전화번호목록_해시 m = new 전화번호목록_해시();
        System.out.println(m.solution(new String[]{"4321", "432", "122", "1334"}));
    }
}
