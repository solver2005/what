package edu.hw1;

import java.util.Arrays;

public class Task6 {
    public static int f(int n, int cnt) {
        if (n == 6174) {
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
        int new_n = y - x;
        //999 -> 9990, 99 -> 9900 .....
        while (new_n < 1000) {
            new_n *= 10;
        }
        return f(new_n, cnt + 1);
    }
}
