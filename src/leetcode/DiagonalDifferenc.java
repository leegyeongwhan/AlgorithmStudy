package leetcode;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifferenc {
    static int diagonalDifference(List<List<Integer>> arr) {
        int result = 0;
        int len = arr.size();
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.size(); i++) {//0,0 1,1 2,2 ; 0,2 1,1 2,0
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    a += arr.get(i).get(j);
                }

                if (j == len - i - 1) {
                    b += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(a - b);
    }

    public static void main(String[] args) {

    }
}
