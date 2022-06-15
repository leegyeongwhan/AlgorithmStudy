package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cardslen = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        ////////////////////// 첫번째배열
        int[] cards = new int[cardslen];
        int i = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            cards[i] = num;
            i++;
        }

        //////////////정렬
        Arrays.sort(cards);
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < m; j++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, cardslen, num)).append(" ");
        }

        System.out.println(sb);
    }

    /////////////// 이진탐색 메서드 정렬된 배열 과 배열의 길이 > 카드의숫자, 찾을 숫자를 입력받는다
    private static int binarySearch(int[] nArr, int nArrLenght, int search) {
        ///index를나타낸다
        int start = 0;
        int mid = 0;
        int last = nArrLenght - 1;

        while (start <= last) {
            mid = (start + last) / 2;

            if (nArr[mid] == search) {
                return 1;
            }
            //찾으려고 하는 값이 중간값보다 크다면
            if (nArr[mid] < search) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return 0;
    }

}
