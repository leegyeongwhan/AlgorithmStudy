package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class ExhaustedSearch {
  public int[] solution(int[] answers) {
    int[] firstStudent = {1, 2, 3, 4, 5};
    int[] secondStudent = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] thirdStudent = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int count1 = 0, count2 = 0, count3 = 0;

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == firstStudent[i % 5]) {
        count1++;
      }
      if (answers[i] == secondStudent[i % secondStudent.length]) {
        count2++;
      }
      if (answers[i] == thirdStudent[i % thirdStudent.length]) {
        count3++;
      }
    }
    int[] answer = {};
    int max = Math.max(Math.max(count1, count2), count3);
    ArrayList<Integer> arr = new ArrayList<Integer>();

    if (max == count1) {
      arr.add(1);
    }
    if (max == count2) {
      arr.add(2);
    }
    if (max == count3) {
      arr.add(3);
    }
    answer = new int[arr.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = arr.get(i);
    }
    return answer;
  }

  public static void main(String[] args) {
    ExhaustedSearch e = new ExhaustedSearch();
    e.solution(new int[]{1, 3, 2, 4, 2});
  }
}
