package edu.hw1;

final class Task2 {
    static final int REDUCEDIGIT = 10;

    private Task2() {
    }

    static int f(int n) {
        int ans = 0;
        int x = Math.abs(n);
        do {
            ans++;
            x /= REDUCEDIGIT;
        } while (x > 0);
        return ans;
    }
}
