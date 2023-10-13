package edu.hw1;

import java.util.*;

public class task1 {
    public static int f(String s) {

        //public void print(String s);
        String[] r = s.split(":");
        int n = Integer.parseInt(r[0]), p = Integer.parseInt(r[1]);
        if (p >= 60) {

            return -1;
        }
        return n * 60 + p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        String str = sc.nextLine();              //reads string

        //public void print(String s);
        String[] r = str.split(":");
        int n = Integer.parseInt(r[0]), p = Integer.parseInt(r[1]);
        if (p >= 60) {
            System.out.println(-1);
            return;
        }
        int ans = n * 60 + p;
        System.out.println(ans);

    }
}
