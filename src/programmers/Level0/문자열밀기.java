package programmers.Level0;

public class 문자열밀기 {
    public int solution(String A, String B) {
        int res = 0;
        for (int i = 0; i <= A.length(); i++) {
            if (A.equals(B)) {
                return res;
            }
            A = shift(A);
            res++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String input = "Stackoverflow";
        for (int i = 0; i <= input.length(); i++) {
            System.out.println(input);
            input = shift(input);
        }
    }

    public static String shift(String s) {
        return s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
    }
}

