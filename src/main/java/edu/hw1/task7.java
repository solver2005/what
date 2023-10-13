package edu.hw1;
import java.util.*;
public class task7{
    public static int rotateRight(int n, int shift){
       ArrayList <Integer> ar = new ArrayList<>();
       int x = n;
       while (x > 0){
        ar.add(x%2);
        x /= 2;
       }
       int si = ar.size();
       shift %= si;
       int[] v = new int[si];
       for (int i = 0;i < si;++i){
            v[i] = ar.get((i+shift)%si);
       }
       int pw = 1;
       n = 0;
       for (int i = 0;i < si;++i){
           n += pw * v[i];
           pw *= 2;
       }
       return n;
    }
    public static int rotateLeft(int n, int shift){
        ArrayList <Integer> ar = new ArrayList<>();
        int x = n;
        while (x > 0){
            ar.add(x%2);
            x /= 2;
        }
        int si = ar.size();
        int[] v = new int[si];
        for(int i = 0;i < si;++i){
            v[i] = ar.get((i - shift + si)%si);
        }
        n = 0;
        int pw = 1;
        for (int i = 0;i < si;++i){
            n += pw * v[i];
            pw *= 2;
        }
        return n;
    }
    public static void main(String[] args){
        System.out.println(rotateRight(8, 1));
    }
}
