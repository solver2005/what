package edu.hw1;

import java.util.*;

public class task6 {
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
        return f(y - x, cnt + 1);
    }

    public static void main(String[] args) {
        System.out.println(f(1234, 0));
    }
}
