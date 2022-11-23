package leetcode;

public class ReverseInteger_7 {
    public int reverse(int x) {
        long result = 0;

        if (x == 0) {
            return 0;
        }

        while (x != 0) {
            result = result * 10 + (x % 10);
            x = x / 10;
        }

        if (result < -2147483648 || 2147483647 < result) {
            return 0;
        }
        return (int) result;
    }
}
