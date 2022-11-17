package programmers.Lever2;

import java.util.*;
import java.util.stream.Stream;

public class 포캣몬 {
    public int solution(int[] nums) {
        int answer = 0;
        int[] ints = Arrays.stream(nums).distinct().toArray();
        if (nums.length/2 > ints.length) {
            return ints.length;
        } else if (nums.length/2 < ints.length) {
            return nums.length/2;
        } else if (nums.length/2 == ints.length) {
            return nums.length/2;

        }
        return answer;
    }
}