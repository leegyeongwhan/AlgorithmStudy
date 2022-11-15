package Lever2;

import java.util.Stack;

public class 짝지어제거하기 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (!stack.isEmpty() && stack.peek() == aChar) {
                stack.pop();
            } else {
                stack.add(aChar);
            }
        }
        return stack.size() == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        짝지어제거하기 s = new 짝지어제거하기();
        System.out.println(s.solution("baabaa"));
    }
}
