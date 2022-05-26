  package Bakjun;

  import java.io.BufferedReader;
  import java.io.IOException;
  import java.io.InputStreamReader;
  import java.util.Scanner;

  public class _2740 {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Scanner scanner = new Scanner(System.in);
      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      int[][] arr1 = new int[num1][num2];

      for (int i = 0; i < num1; i++) {
        for (int j = 0; j < num2; j++) {
          int cal = scanner.nextInt();
          arr1[i][j] = cal;
        }
      }
  //
  //    for (int i = 0; i < arr1.length; i++) {
  //      for (int j = 0; j < arr1[i].length; j++) {
  //        System.out.print(arr1[i][j]);
  //      }
  //      System.out.println();
  //    }

      int num3 = scanner.nextInt();
      int num4 = scanner.nextInt();
      int[][] arr2 = new int[num3][num4];

      for (int i = 0; i < num3; i++) {
        for (int j = 0; j < num4; j++) {
          int cal = scanner.nextInt();
          arr2[i][j] = cal;
        }
      }

  //    for (int i = 0; i < arr2.length; i++) {
  //      for (int j = 0; j < arr2[i].length; j++) {
  //        System.out.print(arr2[i][j]);
  //      }
  //      System.out.println();
  //    }

      int[][] sumArr = new int[num1][num4];
      for (int i = 0; i < num1; i++)
        for (int j = 0; j < num4; j++)
          for (int k = 0; k < num3; k++){
            sumArr[i][j] += arr1[i][k] * arr2[k][j];
          }



      for (int i = 0; i < sumArr.length; i++) {
        for (int j = 0; j < sumArr[i].length; j++) {
          System.out.print(sumArr[i][j] + " ");
        }
        System.out.println();
      }
    }


  }
