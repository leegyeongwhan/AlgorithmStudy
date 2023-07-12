package programmers.Lever2;

public class 예상대진표 {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (true) {
            a= (a+1) /2;
            b= (b+1) /2;
            if (a == b) {
                answer++;
                return answer;
            }
            answer++;
        }
    }

    public static void main(String[] args) {
        예상대진표 s = new 예상대진표();
        s.solution(4, 3, 4);
    }
}
