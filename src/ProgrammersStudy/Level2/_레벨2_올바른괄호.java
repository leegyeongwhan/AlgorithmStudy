package ProgrammersStudy.Level2;

import java.util.Stack;

public class _레벨2_올바른괄호 {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        final int inputLength = s.length();

        for (int i = 0; i < inputLength; i++) {
            if (s.charAt(i) == '(') {
                stack.push(String.valueOf(s.charAt(i)));
            } else if (s.charAt(i) == ')') {
                if (isStackEmptyCheck(stack)) {
                    return false;
                }
                stack.pop();
            }
        }

        if (isStackEmptyCheck(stack)) {
            return true;
        }
        return false;
    }

    private boolean isStackEmptyCheck(Stack<String> stack) {
        return stack.isEmpty();
    }
}
