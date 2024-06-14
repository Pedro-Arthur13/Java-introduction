package net.arthur;

import java.util.Scanner;

public class BolleanAndComparisonOperators {
    public static void main(String[] args) {
        // Booleans and Comparison Operators

        boolean likeTheLectures = true;
        boolean maeTemCafe = false;

        //Comparison Operators
        // > >= != == <= <
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your score: ");
        String score = scanner.next();

        int score2  = Integer.parseInt(score); // Convertendo string em inteiro
        boolean passedClass = score2 >= 50 ;
        System.out.println("You passed in class: " + passedClass + " with " + score2 + " points!");

        boolean hasPerfectScore = score2 == 100;
        boolean failedClass = !passedClass;

    }
}
