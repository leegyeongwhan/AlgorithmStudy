package leetcode;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return result;
        }

        result = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String cur = strs[i];
            while (cur.indexOf(result) != 0) {
                result = result.substring(0, result.length()-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongestCommonPrefix_14 m = new LongestCommonPrefix_14();
        System.out.println(m.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
//