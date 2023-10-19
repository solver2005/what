package edu.hw1;

import java.util.Arrays;

class Task6 {
    final static int kaperkarNumber = 6174;
    final static int theSmallestFourDigitNumber = 1000;
    final static int keepZeroes = 10;
    public static int f(int n, int cnt) {
        if (n == kaperkarNumber) {
            return cnt;
        }
        String c = Integer.toString(n);
        char[] t = c.toCharArray();
        Arrays.sort(t);
        String a = new String(t);
        int x = Integer.parseInt(a);
        int si = t.length;
        char[] v = new char[si];
        for (int i = 0; i < si; ++i) {
            v[i] = t[si - i - 1];
        }
        a = new String(v);
        int y = Integer.parseInt(a);
        int newN = y - x;
        //999 -> 9990, 99 -> 9900 .....
        while (newN < theSmallestFourDigitNumber) {
            newN *= keepZeroes;
        }
        return f(newN, cnt + 1);
    }
}
