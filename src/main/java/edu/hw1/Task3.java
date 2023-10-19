package edu.hw1;

import java.util.Arrays;

public class Task3 {
    public static boolean isNeastable(int[][] r) {
        Arrays.sort(r[0]);
        Arrays.sort(r[1]);
        int first_array_size = r[0].length;
        int second_array_size = r[1].length;
        int min1 = r[0][0], min2 = r[1][0], max1 = r[0][first_array_size - 1], max2 = r[1][second_array_size - 1];
        return (min1 > min2 && max1 < max2);
    }
}
