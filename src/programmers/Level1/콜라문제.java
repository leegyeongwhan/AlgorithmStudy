package programmers.Level1;

public class 콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int cnt = n;
        while (a <= cnt) {
            int change = cnt / a * b;
            int remain = cnt % a;
            answer += change;
            cnt = change + remain;
        }
        return answer;
    }

    public static void main(String[] args) {
        콜라문제 m = new 콜라문제();
        System.out.println(m.solution(2, 1, 20));
    }
}
