package edu.hw1;

class Task8 {
    public final static int mn = -2;
    public final static int sizeOfTheChessBoard = 8;

    public static boolean knightBoardCapture(int[][] ar) {
        int[] x = {-1, mn, mn, -1, 1, 2, 2, 1};
        int[] y = {mn, -1, 1, 2, 2, 1, -1, mn};
        for (int i = 0; i < sizeOfTheChessBoard; ++i) {
            for (int j = 0; j < sizeOfTheChessBoard; ++j) {
                if (ar[i][j] == 0) {
                    continue;
                }
                for (int q = 0; q < sizeOfTheChessBoard; ++q) {
                    if ((i + x[q] < sizeOfTheChessBoard) && (i + x[q] >= 0) && (j + y[q] >= 0) &&
                        (j + y[q] < sizeOfTheChessBoard)) {
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
