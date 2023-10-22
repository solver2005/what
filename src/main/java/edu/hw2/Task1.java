package edu.hw2;

sealed interface Expr {
    double evaluate();

    record Constant(int n) implements Expr {
        public double evaluate() {
            return n;
        }
    }

    record Negate(Expr n) implements Expr {
        public double evaluate() {
            return -n.evaluate();
        }
    }

    record Exponent(Expr a, int x) implements Expr {
        public double evaluate() {
            return Math.pow(a.evaluate(), x);
        }
    }

    record Addition(Expr a, Expr b) implements Expr {
        public double evaluate() {
            return a.evaluate() + b.evaluate();
        }
    }

    record Multiplication(Expr a, Expr b) implements Expr {
        public double evaluate() {
            return a.evaluate() * b.evaluate();
        }
    }
}

public class Task1 {
    private Task1(){
    }
    public static void main(String[] args) {
        var two = new Expr.Constant(2);
        var four = new Expr.Constant(4);
        var negOne = new Expr.Negate(new Expr.Constant(1));
        var sumTwoFour = new Expr.Addition(two, four);
        var mult = new Expr.Multiplication(sumTwoFour, negOne);
        var exp = new Expr.Exponent(mult, 2);
        var res = new Expr.Addition(exp, new Expr.Constant(1));
        System.out.println(res + " = " + res.evaluate());
    }
}
