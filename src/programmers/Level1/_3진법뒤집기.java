package programmers.Level1;

public class _3진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        String string = sb.toString();
        int i = Integer.parseInt(string, 3);
        return i;
    }

    public static void main(String[] args) {
        _3진법뒤집기 m = new _3진법뒤집기();
        System.out.println(m.solution(45));
    }
}
