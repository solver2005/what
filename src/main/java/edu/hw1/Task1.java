package edu.hw1;

import java.util.Scanner;

public class Task1 {
    static final int seconds_in_minute = 60;

    public static int f(String s) {
        String[] r = s.split(":");
        if (r.length < 2) {
            return -1;
        }
        int n = Integer.parseInt(r[0]), p = Integer.parseInt(r[1]);
        if (p >= seconds_in_minute) {

            return -1;
        }
        return n * seconds_in_minute + p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] r = str.split(":");
        int n = Integer.parseInt(r[0]), p = Integer.parseInt(r[1]);
        if (p >= seconds_in_minute) {
            System.out.println(-1);
            return;
        }
        int ans = n * seconds_in_minute + p;
        System.out.println(ans);

    }
}
