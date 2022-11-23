package leetcode;

public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
//        if (x < 0) {
//            return false;
//        }
//        StringBuilder sb = new StringBuilder();
//        sb.append(x).reverse();
//        String string = sb.toString();
//        if (string.equals(String.valueOf(x))) {
//            return true;
//        }
//        return false;
        int number = x;
        int reverse = 0;

        while (number > 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }

        if (reverse == x) {
            return true;
        }
        return false;
    }
}
