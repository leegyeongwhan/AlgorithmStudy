package programmers.Level1;

public class 최대공약수최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }

    private int gcd(int num1, int num2) { //3 12
        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }

    public static void main(String[] args) {
        최대공약수최소공배수 m = new 최대공약수최소공배수();
        System.out.println(m.solution(3, 12));
    }
}
