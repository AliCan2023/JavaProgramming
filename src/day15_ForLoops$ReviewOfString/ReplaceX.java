package day15_ForLoops$ReviewOfString;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();
        String str = "xcodeX";

        String result = str.replace("x", "A").replace("X", "a"); //Acodea;

        System.out.println("result = " + result);


    }
}
/*
Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */