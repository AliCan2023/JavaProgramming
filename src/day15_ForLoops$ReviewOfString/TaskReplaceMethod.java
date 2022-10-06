package day15_ForLoops$ReviewOfString;

import java.util.Scanner;

public class TaskReplaceMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = new Scanner(System.in).next(); //xcodex

        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a"); // display "acodex";
            System.out.println("word = " + word);
        }

        scan.close();
    }
}
/*
Warmup tasks:
	1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */