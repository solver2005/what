package edu.hw1;

import java.util.ArrayList;

final class Task7 {
    private Task7() {
    }

    public static int rotateRight(int n, int shift) {
        ArrayList<Integer> ar = new ArrayList<>();
        int x = n;
        while (x > 0) {
            ar.add(x % 2);
            x /= 2;
        }
        int si = ar.size();
        int shift2 = shift;
        shift2 %= si;
        int[] v = new int[si];
        for (int i = 0; i < si; ++i) {
            v[i] = ar.get((i + shift2) % si);
        }
        int pw = 1;
        for (int i = 0; i < si; ++i) {
            x += pw * v[i];
            pw *= 2;
        }
        return x;
    }

    public static int rotateLeft(int n, int shift) {
        ArrayList<Integer> ar = new ArrayList<>();
        int x = n;
        while (x > 0) {
            ar.add(x % 2);
            x /= 2;
        }
        int si = ar.size();
        int[] v = new int[si];
        for (int i = 0; i < si; ++i) {
            v[i] = ar.get((i - shift + si) % si);
        }
        int pw = 1;
        for (int i = 0; i < si; ++i) {
            x += pw * v[i];
            pw *= 2;
        }
        return x;
    }
}
