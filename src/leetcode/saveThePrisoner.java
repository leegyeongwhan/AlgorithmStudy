package leetcode;

public class saveThePrisoner {
    public static int saveThePrisoner(int n, int m, int s) { //n죄수 숫자 m사탕 갯수  s의자
        // Write your code here
        int res = (s + m - 1) % n;
        if (res == 0) return n;
        else
            return res;
    }

    public static void main(String[] args) {
        saveThePrisoner s = new saveThePrisoner();
        System.out.println(s.saveThePrisoner(764720478, 764720478, 764720477));
    }
}
