package edu.hw1;

public class Task2 {
    public static int f(int n) {
        int ans = 0;
        n = Math.abs(n);
        do {
            ans++;
            n /= 10;
        } while (n > 0);
        return ans;
    }
}
