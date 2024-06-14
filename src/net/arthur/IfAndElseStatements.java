package net.arthur;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class IfAndElseStatements {
    public static void main(String[] args) {
        /* If and Else Statements(instruções) */

        int exam1;
        int exam2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Results for exam1: ");
        exam1 = scanner.nextInt();
        System.out.println("Results for exam1: ");
        exam2 = scanner.nextInt();


        // curly bracket -> {}
        if(exam1 >= 50){
            System.out.println("Congratulations! You have passed Exam1");
        }else{
            System.out.println("You haven't passed Exam1! You're bastard");
        }

        if(exam2 >= 50){
            System.out.println("Congratulations! You have passed Exam2");
        }else{
            System.out.println("You have failed Exam2! You're bastard");
        }

        if(exam1 >= 50 && exam2 >=50){
            System.out.println("Congratulations! You have passed the Class");

        }

    }
}
