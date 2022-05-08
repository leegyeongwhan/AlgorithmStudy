package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneNumber {
  public String solution(String phone_number) {
    String answer = "";
    String[] arr = phone_number.split("");
    Arrays.toString(arr);
    int num = phone_number.length();
    for (int i = 0; i <  num ; i++) {
      if (i < (num - 4)){
        arr[i] = "*";
      }
    }
    for (int i = 0 ; i < arr.length; i++){
      answer += arr[i];
    }
    return answer;
  }

  public static void main(String[] args) {
    PhoneNumber p  = new PhoneNumber();
    System.out.println(p.solution("01033334444"));
  }
}




