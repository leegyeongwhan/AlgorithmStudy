package Bakjun;

import java.util.Arrays;
import java.util.Scanner;

public class _4344 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String studentNumber = "";
    int changeNumber = 0;
    double sum;
    int cnt;
    double hap = 0;


    int caseNumber = scanner.nextInt();  //  첫 줄에 테스트 케이스 갯수 5
    for (int i = 0; i < caseNumber; i++) {
      changeNumber = Integer.parseInt(scanner.next());  //학생수 과목수
      sum = 0;
      cnt = 0;
      int[] arr = new int[changeNumber]; // 학생수 만큼 배열생성
      //성적입력
      for (int j = 0; j < changeNumber; j++) {
        int subjectNumber = scanner.nextInt();   // 과목 수 ,점수
        sum += subjectNumber;
        arr[j] += subjectNumber;       // 평균 넘은 학생 배열에 저장
      }
      sum = sum / changeNumber;
      sum = Math.round(sum * 1000) / 1000.0;
      for (int z = 0; z < arr.length; z++) {      //몇명이 평균 넘었는지 계산
        if (sum < arr[z]) {
          cnt++;
        }
      }
      hap = 100 * ((float) cnt / changeNumber);      //백분위
      System.out.printf("%.3f%%\n",(hap));
    }

  }
}
