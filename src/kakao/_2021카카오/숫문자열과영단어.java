package kakao._2021카카오;


/**
 * 0	zero
 * 1	one
 * 2	two
 * 3	three
 * 4	four
 * 5	five
 * 6	six
 * 7	seven
 * 8	eight
 * 9	nine
 */
public class 숫문자열과영단어 {
    public int solution(String s) {
        String[] arr = {"zero", "one", "two",
                "three", "four", "five", "six",
                "seven", "eight", "nine"};

        for (int i = 0; i < arr.length; i++) {
            s = s.replaceAll(arr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        숫문자열과영단어 s = new 숫문자열과영단어();
        System.out.println(s.solution("23four5six7"));
    }
}
