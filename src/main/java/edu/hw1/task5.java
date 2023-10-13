package edu.hw1;

public class task5 {
    public static boolean Palindrome(String n) {
        char[] c = n.toCharArray();
        while (c.length > 1){
            boolean fl = true;
            int l = c.length;
            for (int i = 0;i < l/2;++i){
                if (c[i] != c[l-i-1]){
                    fl = false;
                    break;
                }
            }
            if (fl)
                return true;
            if (l % 2 == 1)
                return false;

            String p = "";
            for (int i = 0;i < l-1; i+=2){
                int a = c[i] - '0', b = c[i+1] - '0';
                int v = a+b;
                if (v <= 9){
                    String m = String.valueOf((char)(v + '0'));
                    p = p.concat(m);
                }
                else{
                    String m = String.valueOf((char)(v%10+'0'));
                    String z = String.valueOf((char)(v/10+'0'));
                    p = p.concat(z);
                    p = p.concat(m);
                }
            }
            c = p.toCharArray();
        }
        return false;
    }
    public static void main(String [] args){
        System.out.println(Palindrome("11211230"));
    }
}
