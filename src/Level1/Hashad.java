package Level1;

public class Hashad {
  public boolean solution(int x) {
    boolean answer;
    int num = x;
    int sum = 0;
    int mox = 0, namuji = 0;


    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    if (x % sum == 0) {
      answer = true;
      return answer;
    } else {
      answer = false;
      return answer;
    }
  }

  public static void main(String[] args) {
    Hashad h = new Hashad();
    h.solution(11);
  }
}
