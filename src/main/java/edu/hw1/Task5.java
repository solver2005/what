package edu.hw1;

public class Task5 {
    public static final int magic_number = 9;

    public static boolean Solution(int n) {
        String s = Integer.toString(n);
        while (s.length() > 1) {
            if (Palindrome(s)) {
                return true;
            }
            if (s.length() % 2 == 1) {
                return false;
            }
            s = Compress(s);
        }
        return false;
    }

    public static boolean Palindrome(String str) {
        int str_size = str.length();
        for (int i = 0; i < str_size / 2; ++i) {
            if (str.charAt(i) != str.charAt(str_size - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String Compress(String n) {
        char[] c = n.toCharArray();
        int c_size = c.length;
        String p = "";
        for (int i = 0; i < c_size - 1; i += 2) {
            int a = c[i] - '0', b = c[i + 1] - '0';
            int v = a + b;
            if (v <= magic_number) {
                String m = String.valueOf((char) (v + '0'));
                p = p.concat(m);
            } else {
                String m = String.valueOf((char) (v % 10 + '0'));
                String z = String.valueOf((char) (v / 10 + '0'));
                p = p.concat(z);
                p = p.concat(m);
            }
        }
        return p;
    }

}
