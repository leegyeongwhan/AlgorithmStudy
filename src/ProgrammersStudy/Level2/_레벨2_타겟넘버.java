package ProgrammersStudy.Level2;


/**
 * +++++
 * -++++ +-++++ ++-++ +++-+ ++++-
 * --+++ -+-+++ -++-+ -+++- +--++
 * ---++
 * ----+
 * -----
 */
public class _레벨2_타겟넘버 {
    int[] arr;
    int target;
    int answer;

    private void dfs(int index, int sum) {
        if (arr.length == index) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        dfs(index + 1, sum + arr[index]);
        dfs(index + 1, sum - arr[index]);
    }

    public int solution(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
        dfs(0, 0);

        return answer;
    }


    public static void main(String[] args) {
        _레벨2_타겟넘버 s = new _레벨2_타겟넘버();
        s.solution(new int[]{1, 1, 1, 1, 1}, 3);
    }
}
