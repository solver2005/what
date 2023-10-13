package edu.hw1;

public class task2 {
    public static int f(int n) {
        int ans = 0;
        do {
            ans++;
            n /= 10;
        } while (n > 0);
        return ans;
    }

}


