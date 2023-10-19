package edu.hw1;

class Task2 {
    static final int reduce_digit = 10;
    static int f(int n) {
        int ans = 0;
        int x = Math.abs(n);
        do {
            ans++;
            x /= reduce_digit;
        } while (x > 0);
        return ans;
    }
}
