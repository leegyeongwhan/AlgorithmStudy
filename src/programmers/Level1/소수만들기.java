package programmers.Level1;

public class 소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    boolean flag = true;
                    for (int z = 2; z < nums[i] + nums[j] + nums[k]; z++) {
                        if ((nums[i] + nums[j] + nums[k]) % z == 0) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        소수만들기 m = new 소수만들기();
        System.out.println(m.solution(new int[]{1, 2, 3, 4}));
    }
}
