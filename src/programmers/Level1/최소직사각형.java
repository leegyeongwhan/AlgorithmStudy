package programmers.Level1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int height = 0;
        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            width = Math.max(width, w);
            height = Math.max(height, h);
        }
        return answer = width * height;
    }
}
