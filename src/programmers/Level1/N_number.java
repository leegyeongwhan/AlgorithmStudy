package programmers.Level1;

class N_number {
  public long[] solution(int x, int n) {
    long[] answer = new long[n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        answer[i] += x;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    N_number n = new N_number();
    System.out.println(n.solution(2, 5));
  }
}