    package Bakjun_Gold;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;
    import java.util.StringTokenizer;

    /**
     * 1 지도상에서 주사위를 이동시켜본다
     * 1-1 지도상에서 주사위가 밖으로 이동한 경우. 무시
     * 2 지도상에서 주사위가 밖으로 이동하지 않은 경우 이동 방향에 따라서 이동합니다.
     * 2-1이동한 칸에 쓰여 있는 수가 0이면, 주사위의 바닥면에 쓰여 있는 수가 칸에 복사된다.
     * 0이 아닌 경우에는 칸에 쓰여 있는 수가 주사위의 바닥면으로 복사되며, 칸에 쓰여 있는 수는 0이 된다.
     * <p>
     * 핵심 주사위 만들기 ,주사위 돌리기
     * 4방향을 돌릴떄 어떻게 돌아가는지 생각해보자
     * 주사위를 굴릴떄 규칙에 유의하자
     */
    public class G4_14499_주사위굴리기 {
        static StringBuilder sb = new StringBuilder();
        static int[][] map;
        static int N;
        static int M;
        static int X;
        static int Y;
        static int[] dirX = {0, 0, -1, 1}; // 동 서 북 남 순서
        static int[] dirY = {1, -1, 0, 0};
        static int[] cube;
        static int cubeceiling;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            cube = new int[6];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < K; i++) {
                int num = Integer.parseInt(st.nextToken());

                if (!moveCubeable(X, Y, num)) {
                    continue;
                }

                moveCube(X, Y, num);
                if (zeroCheck(X, Y)) {
                    dicefloorClonetoPoint();
                } else {
                    pointCloneDicefloor();
                }

                cubeceiling = cube[2];
                sb.append(cubeceiling).append("\n");
            }
            System.out.println(sb);
        }

        private static void moveCube(int x, int y, int num) {

            int[] cloneCube = cube.clone();
            int cubeCelling = cloneCube[2];
            //핵심로직
            switch (num) {
                case 1:
                    cube[2] = cube[3];
                    cube[3] = cube[5];
                    cube[5] = cube[1];
                    cube[1] = cubeCelling;
                    break;
                case 2:
                    cube[2] = cube[1];
                    cube[1] = cube[5];
                    cube[5] = cube[3];
                    cube[3] = cubeCelling;
                    break;
                case 3:
                    cube[2] = cube[4];
                    cube[4] = cube[5];
                    cube[5] = cube[0];
                    cube[0] = cubeCelling;
                    break;
                case 4:
                    cube[2] = cube[0];
                    cube[0] = cube[5];
                    cube[5] = cube[4];
                    cube[4] = cubeCelling;
                    break;
            }
        }

        private static void pointCloneDicefloor() {
            cube[5] = map[X][Y];
            map[X][Y] = 0;
        }

        private static void dicefloorClonetoPoint() {
            map[X][Y] = cube[5];
        }

        private static boolean zeroCheck(int x, int y) {
            return map[X][Y] == 0;
        }

        private static boolean moveCubeable(int x, int y, int num) {
            int nx = dirX[num - 1] + x;
            int ny = dirY[num - 1] + y;

            if (nx > N - 1 || ny > M - 1 || nx < 0 || ny < 0) {
                return false;
            }
            X = nx;
            Y = ny;
            return true;
        }
    }
