package edu.hw1;

public class Task4 {
    public static String fixString(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i += 2) {
            char tmp = c[i];
            c[i] = c[i + 1];
            c[i + 1] = tmp;
        }
        s = new String(c);
        return s;
    }
}
