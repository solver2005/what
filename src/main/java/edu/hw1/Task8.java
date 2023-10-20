package edu.hw1;

class Task8 {
    public final static int MN = -2;
    public final static int SIZEOFTHECHESSBOARD = 8;

    public static boolean knightBoardCapture(int[][] ar) {
        int[] x = {-1, MN, MN, -1, 1, 2, 2, 1};
        int[] y = {MN, -1, 1, 2, 2, 1, -1, MN};
        for (int i = 0; i < SIZEOFTHECHESSBOARD; ++i) {
            for (int j = 0; j < SIZEOFTHECHESSBOARD; ++j) {
                if (ar[i][j] == 0) {
                    continue;
                }
                for (int q = 0; q < SIZEOFTHECHESSBOARD; ++q) {
                    if ((i + x[q] < SIZEOFTHECHESSBOARD) && (i + x[q] >= 0) && (j + y[q] >= 0)
                        && (j + y[q] < SIZEOFTHECHESSBOARD)) {
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
