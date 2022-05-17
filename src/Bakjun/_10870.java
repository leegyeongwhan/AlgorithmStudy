package Bakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10870 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    System.out.println(fibonacci(num));
  }

  static int fibonacci(int num) {  //10
    int answer = 0;

    if (num == 0) {
      return 0;
    }
    if (num == 1) {
      return 1;
    } else {
      answer = fibonacci(num - 1) + fibonacci(num - 2);
    }

    return answer;
  }
}

