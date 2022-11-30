package programmers.Level1;

public class 나머지가이되는수찾기 {
    public int solution(int n) {
        int answer = 0;
        int x = 1;
        while (true) {
            if (n % x == 1) {
                answer = x;
                break;
            }
            x++;
        }
        return answer;
    }
}
