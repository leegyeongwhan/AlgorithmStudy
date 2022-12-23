package programmers.Level1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int[] r = new int[sizes.length];
        int[] l = new int[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            r[i] = Math.max(sizes[i][0], sizes[i][1]);
            l[i] = Math.min(sizes[i][0], sizes[i][1]);
        }

        int left = 0;
        int right = 0;

        for (int i = 0; i < r.length; i++) {
            left = Math.max(left, r[i]);
            right = Math.max(right, l[i]);
        }
        return left * right;
    }
}
