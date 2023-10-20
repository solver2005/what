package edu.hw1;

import java.util.Arrays;

class Task6 {
    final static int KAPERKARNUMBER = 6174;
    final static int THESMALLESTFOURDIGINUMBER = 1000;
    final static int KEEPZEROES = 10;

    public static int f(int n, int cnt) {
        if (n == KAPERKARNUMBER) {
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
        while (newN < THESMALLESTFOURDIGINUMBER) {
            newN *= KEEPZEROES;
        }
        return f(newN, cnt + 1);
    }
}
