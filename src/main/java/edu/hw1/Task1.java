package edu.hw1;

class Task1 {
    static final int secondsInMinute = 60;

    public static int f(String s) {
        String[] r = s.split(":");
        if (r.length < 2) {
            return -1;
        }
        int n = Integer.parseInt(r[0]);
        int p = Integer.parseInt(r[1]);
        if (p >= secondsInMinute) {

            return -1;
        }
        return n * secondsInMinute + p;
    }
}
