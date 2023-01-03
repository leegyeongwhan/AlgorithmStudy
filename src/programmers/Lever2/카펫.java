package programmers.Lever2;

public class 카펫 {
    public int[] solution(int brown, int yellow) { //10 ,2
        int[] answer = new int[2];

        int sum = brown + yellow;
        for (int i = 3; i <= sum; i++) {
            int j = sum / i;
            if (sum % i == 0 && j >= 3) {
                int width = Math.max(i, j);
                int height = Math.min(i, j);
                int yell = (width - 2) * (height - 2);

                if (yell == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        카펫 m = new 카펫();
        System.out.println(m.solution(24,24));
    }
}
