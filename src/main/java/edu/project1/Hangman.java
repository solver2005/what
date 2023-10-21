package edu.project1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Hangman {
    private Hangman() {
    }

    private static final int ATTEMPTS = 5;
    private static final int SIZEOFTHEDICTIONARY = 6;

    @SuppressWarnings({"RegexpSinglelineJava", "UncommentedMain"})
    public static void main(String[] args) {
        String[] ar = {"rock", "december", "hello", "man", "water", "golf"};
        Random rand = new Random();
        int n = rand.nextInt(SIZEOFTHEDICTIONARY);
        char[] guessedSymbols = ar[n].toCharArray();
        int wordSize = guessedSymbols.length;
        char[] guess = new char[wordSize];
        Arrays.fill(guess, '*');
        Scanner sc = new Scanner(System.in);
        int mistakes = 0;
        while (mistakes < ATTEMPTS) {
            System.out.println("Guess a letter: ");
            String playerInp = sc.nextLine();
            if (playerInp.length() != 1) {
                System.out.println("Wrong input");
                continue;
            }
            if (new String(guessedSymbols).contains(playerInp)) {
                while (new String(guessedSymbols).contains(playerInp)) {
                    int ind = new String(guessedSymbols).indexOf(playerInp);
                    guess[ind] = guessedSymbols[ind];
                    guessedSymbols[ind] = '#';
                }
                System.out.println(guess);
                System.out.println("Hit!");
            } else {
                mistakes++;
                System.out.println("Missed, mistake " + mistakes + " out of 5.");
            }
            System.out.println();
            System.out.println("The word: " + new String(guess));
            System.out.println();
            if (!(new String(guess).contains("*"))) {
                System.out.println("You won!");
                break;
            }
        }
        if (mistakes == ATTEMPTS) {
            System.out.println("You lost!");
        }
    }
}
