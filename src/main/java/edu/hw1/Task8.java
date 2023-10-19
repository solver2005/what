package edu.hw1;

public class Task8 {
    public static boolean knightBoardCapture(int[][] ar) {
        int[] x = {-1, -2, -2, -1, 1, 2, 2, 1};
        int[] y = {-2, -1, 1, 2, 2, 1, -1, -2};
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (ar[i][j] == 0) {
                    continue;
                }
                for (int q = 0; q < 8; ++q) {
                    if ((i + x[q] < 8) && (i + x[q] >= 0) && (j + y[q] >= 0) && (j + y[q] < 8)) {
                        if (ar[i + x[q]][j + y[q]] == 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
