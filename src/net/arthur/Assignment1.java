package net.arthur;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int score = 0;
        int answer1 = 8;
        String answer2 = "Notch";
        String answer3 = "Cave game";
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many planets de we have in the solar system? ");
        int input1 = scanner.nextInt();

        System.out.println("What are the nickname of the minecraft creator? ");
        String input2 = scanner.next();

        System.out.println("What is the first name of minecraft? ");
        String input3 = scanner.next();

        if(input1 == answer1){
            score++;
            System.out.println("Correct answer for question 1");
        }
        else {
            System.out.println("Incorrect answer for question 1");

        }
        if(input2.equals(answer2)){
            score++;
            System.out.println("Correct answer for question 2");
        }else {
            System.out.println("Incorrect answer for question 2");
        }
        if(input3.equals(answer3)){
            score++;
            System.out.println("Correct answer for question 3");
        }else {
            System.out.println("Incorrect answer for question 3");

        }

        System.out.println("Your score is " + score);
    }

}
