package programmers.Level1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        if (len % 2 == 0) { //짝수 홀수
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        가운데글자가져오기 s = new 가운데글자가져오기();
        System.out.println(s.solution("abccd"));
    }
}
