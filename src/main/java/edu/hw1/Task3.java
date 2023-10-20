package edu.hw1;

import java.util.Arrays;

final class Task3 {
    public static boolean isNeastable(int[][] r) {
        Arrays.sort(r[0]);
        Arrays.sort(r[1]);
        int firstArraySize = r[0].length;
        int secondArraySize = r[1].length;
        int min1 = r[0][0];
        int min2 = r[1][0];
        int max1 = r[0][firstArraySize - 1];
        int max2 = r[1][secondArraySize - 1];
        return (min1 > min2 && max1 < max2);
    }
}
