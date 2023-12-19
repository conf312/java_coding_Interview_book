package coding.challenge.colorspots;

/*
같은 color로 이루어진 최대 영역의 수 구하기
 */
public class BiggestColorSpots {
    private static int currentColorSpot;
    private static int biggestColorSpot;

    public static void computeColorSpot(int i, int j, int cols, int rows, int a[][], int color) {
        a[i][j] = -a[i][j];
        currentColorSpot++;

        // 상
        if (i > 1 && a[i -1][j] == color) {
            computeColorSpot(i - 1, j, cols, rows, a, color);
        }

        // 하
        if ((i + 1) < rows && a[i + 1][j] == color) {
            computeColorSpot(i+1, j, cols, rows, a, color);
        }

        // 좌
        if (j > 1 && a[i][j - 1] == color) {
            computeColorSpot(i, j - 1, cols, rows, a, color);
        }

        // 우
        if ((j + 1) < cols && a[i][j + 1] == color) {
            computeColorSpot(i, j + 1, cols, rows, a, color);
        }
    }

    public static void determineBiggestColorSpot(int cols, int rows, int a[][]) {
        biggestColorSpot = 0;
        int color = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] > 0) {
                    currentColorSpot = 0;
                    computeColorSpot(i, j, cols, rows, a, a[i][j]);

                    if (currentColorSpot > biggestColorSpot) {
                        biggestColorSpot = currentColorSpot;
                        color = a[i][j] * (-1);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int cols = 5, rows = 5;
        int[][] a = new int[rows][cols];

        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[0][3] = 3;
        a[0][4] = 2;

        a[1][0] = 2;
        a[1][1] = 1;
        a[1][2] = 2;
        a[1][3] = 3;
        a[1][4] = 3;

        a[2][0] = 2;
        a[2][1] = 3;
        a[2][2] = 3;
        a[2][3] = 3;
        a[2][4] = 3;

        a[3][0] = 3;
        a[3][1] = 2;
        a[3][2] = 1;
        a[3][3] = 1;
        a[3][4] = 3;

        a[4][0] = 1;
        a[4][1] = 3;
        a[4][2] = 2;
        a[4][3] = 3;
        a[4][4] = 3;

        /*
        1 2 3 3 2
        2 1 2 3 3
        2 3 3 3 3
        3 2 1 1 3
        1 3 2 3 3
         */
        determineBiggestColorSpot(cols, rows, a);
        System.out.println(biggestColorSpot);
    }

}
