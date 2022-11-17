package programmers.Lever2;

public class JadenCase문자열만들기 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split("");
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            answer += flag ? arr[i].toUpperCase() : arr[i];
            flag = arr[i].equals(" ") ? true : false;
        }
        return answer;
    }

    public static void main(String[] args) {
        JadenCase문자열만들기 s = new JadenCase문자열만들기();
        System.out.println(s.solution("3people unFollowed    me   "));
        System.out.println(s.solution("for the last week"));
    }
}
