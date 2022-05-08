package Level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SamNumber {
  public int[] solution(int[] arr) {
    ArrayList<Integer> answer = new ArrayList<Integer>();

//    int value = -1;
//    for (int i = 0; i < arr.length; i++) {
//      if (arr[i] != value) {
//        answer.add(arr[i]);
//        value = arr[i];
//      }
//    }
    int num = 10;
    for (int i = 0; i < arr.length; i++) {
      if (num != arr[i]) {
        answer.add(arr[i]);
        num = arr[i];
      }
    }
    int[] answer1 = new int[answer.size()];
    for (int i = 0; i < answer1.length; i++) {
          answer1[i] = answer.get(i);
    }
    return answer1;
  }
}
