package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _2581 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num1 = Integer.parseInt(br.readLine());
    int num2 = Integer.parseInt(br.readLine());

    int hap = 0;
    List<Integer> list = new ArrayList<Integer>();
    for (int i = num1; i <= num2; i++) {
      if (sosu(i) > 0) {
        list.add(sosu(i));
      }
    }
    for (int i = 0; i < list.size(); i++) {
      hap += list.get(i);
    }
    if(hap > 0){
      System.out.println(hap);
      System.out.println(list.get(0));
    }else {
      System.out.println(-1);
    }


  }

  static int sosu(int num) {
    if (num < 2) {
      return 0;
    }
    int i = 2;
    while (i < num) {
      if (num % i == 0) {  //소수가아님
        return 0;
      }
      i++;
    }
    return num;
  }
}
