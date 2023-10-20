package edu.hw1;

final class Task1 {
    static final int SECONDSINMINUTES = 60;

    private Task1() {
    }

    public static int f(String s) {
        String[] r = s.split(":");
        if (r.length < 2) {
            return -1;
        }
        int n = Integer.parseInt(r[0]);
        int p = Integer.parseInt(r[1]);
        if (p >= SECONDSINMINUTES) {

            return -1;
        }
        return n * SECONDSINMINUTES + p;
    }
}
