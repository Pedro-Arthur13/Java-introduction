package net.arthur;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Loops


        String question1 = "How many planets de we have in the solar system?";
        String question2 = "What are the nickname of the minecraft creator?";
        String question3 = "What is the first name of minecraft?";

        String answer1 = "8";
        String answer2 = "Notch";
        String answer3 = "Cave game";

        String[] questions = new String[3]; // 3 elements of index = 0,1,2
        questions[0] = question1;
        questions[1] = question2;
        questions[2] = question3;

        String[] answers = new String[3]; // 3 elements of index = 0,1,2
        answers[0] = answer1;
        answers[1] = answer2;
        answers[2] = answer3;

        for (int i = 0; i < 100; i++){ // for(initializing an integer, end, steps){}
            System.out.println(i);
        }
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }

        //Foreach
        //  É que nem o "for questao in questoes" em python
        for(String question: questions){ // for each String question in questions
            System.out.println(question);
        }


        //while
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Do you want to continue? ");
            if(scanner.next().equals("yes")){
                continue;
            }else{
                break;
            }
        }


    }
}
