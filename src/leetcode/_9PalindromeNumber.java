package leetcode;

public class _9PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        String revers = String.valueOf(sb.reverse());
        if (sb.toString().equals(revers)) {
            return true;
        }
        return false;
    }
}
