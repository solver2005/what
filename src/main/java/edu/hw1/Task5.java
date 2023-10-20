package edu.hw1;

public class Task5 {
    public static final int MAGICNUMBER = 9;
    public static final int CHECKDIGIT = 10;

    public static boolean solution(int n) {
        String s = Integer.toString(n);
        while (s.length() > 1) {
            if (palindrome(s)) {
                return true;
            }
            if (s.length() % 2 == 1) {
                return false;
            }
            s = compress(s);
        }
        return false;
    }

    public static boolean palindrome(String str) {
        int strSize = str.length();
        for (int i = 0; i < strSize / 2; ++i) {
            if (str.charAt(i) != str.charAt(strSize - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String compress(String n) {
        char[] c = n.toCharArray();
        int cSize = c.length;
        String p = "";
        for (int i = 0; i < cSize - 1; i += 2) {
            int a = c[i] - '0';
            int b = c[i + 1] - '0';
            int v = a + b;
            if (v <= MAGICNUMBER) {
                String m = String.valueOf((char) (v + '0'));
                p = p.concat(m);
            } else {
                String m = String.valueOf((char) (v % CHECKDIGIT + '0'));
                String z = String.valueOf((char) (v / CHECKDIGIT + '0'));
                p = p.concat(z);
                p = p.concat(m);
            }
        }
        return p;
    }
}
