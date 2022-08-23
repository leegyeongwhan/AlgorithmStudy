package Bakjun_Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G5_14719_빗물 {
    static int[] mapWidth;
    static int h;
    static int w;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        mapWidth = new int[w];
        st = new StringTokenizer(br.readLine());

        int i = 0;
        while (st.hasMoreTokens()) {
            mapWidth[i] = Integer.parseInt(st.nextToken());
            i++;
        }


        /**
         * 현재 인덱스의 왼쪽에서 가장 높은 건물의 높이를 구한다.
         * 현재 인덱스의 오른쪽에서 가장 높은 건물의 높이를 구한다.
         * 그중 더 낮은 건물의 높이를 구한다.
         * 3번에서 구한 높이에서 현재 인덱스에 있는 건물의 높이를 뺀다.
         * 위의 과정을 1번째, 마지막을 제외하고 현재 인덱스에서 담길 수 있는 빗물의 양을 합한다.
         *
         */
        //더큰게있는지 체크 첫번째와 마지막 블럭은 제외
        for (int j = 1; j < mapWidth.length - 1; j++) {
            //왼쪽인덱스중 가장큰값
            int leftIdx = 0;
            for (int k = 0; k < j; k++) {
                leftIdx = Math.max(leftIdx, mapWidth[k]);
            }
            int rightIdx = 0;
            for (int k = j + 1; k < w; k++) {
                rightIdx = Math.max(rightIdx, mapWidth[k]);
            }
            //왼쪽,오른쪽 가장 큰 값 사이에는 이둘의 값보다 큰값이 있으면안된다.
            int minIdex = Math.min(leftIdx, rightIdx);
            if (leftIdx > mapWidth[j] && rightIdx > mapWidth[j]) {
                result += minIdex - mapWidth[j];
            }

        }
        System.out.println(result);
    }
}
