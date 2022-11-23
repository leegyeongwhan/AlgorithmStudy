package leetcode;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {  //number 1,2, 3  targer 5
        int[] answer = new int[2];
        //  Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }

        }
        return answer;
    }
}
