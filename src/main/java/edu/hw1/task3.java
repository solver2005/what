package edu.hw1;
public class task3{
    public static boolean isNeastable(int [][] r){
        //boolean ans = true;
        int min1 = r[0][0], min2 = r[1][0], max1 = r[0][0], max2 = r[1][0];
        for (int i = 0;i < r[0].length;i++){
            min1 = Math.min(min1, r[0][i]);
            max1 = Math.max(max1, r[0][i]);
        }
        for (int i = 0;i < r[1].length;i++){
            min2 = Math.min(min2, r[1][i]);
            max2 = Math.max(max2, r[1][i]);
        }
        return (min1 > min2 & max1 < max2);
    }
}
