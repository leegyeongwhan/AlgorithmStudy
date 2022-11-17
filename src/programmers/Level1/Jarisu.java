package programmers.Level1;

public class Jarisu {
  int answer = 0;
  public int solution(int n) {
      if (n < 10) {
        answer += n % 10;
     //   System.out.println(answer);
      }else {
        solution(n / 10);
        answer = answer + (n % 10);
      }
    return answer;
  }

  public static void main(String[] args) {
    Jarisu j = new Jarisu();
    System.out.println(j.solution(123));
  }
}
