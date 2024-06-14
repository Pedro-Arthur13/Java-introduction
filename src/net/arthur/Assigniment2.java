package net.arthur;

import java.util.Scanner;

public class Assigniment2 {
    public static void main(String[] args) {
        //Assigniment 2

        int score = 0;

        String[] questions = new String[5];
        questions[0] = "How many planets de we have in the solar system?";
        questions[1] = "What are the nickname of the minecraft creator?";
        questions[2] = "What was the first name of minecraft?";
        questions[3] = "What is the capital of Australia?";
        questions[4] = "Who wrote Don Quixote?";

        String[] answers = new String[5];
        answers[0] = "8";
        answers[1] = "Notch";
        answers[2] = "Cave game";
        answers[3] = "Canberra";
        answers[4] = "Miguel de Cervantes";

        String[] userAnswers = new String[5];

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Hello, here is the questions(type -1 for exit): ");
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                String userAnswer = scanner.nextLine();
                userAnswers[i] = userAnswer;
                }
            verifyAnswersAndScore(userAnswers,answers,score);
            System.out.println("Do you want to play again? [y] or [n]");
            if(scanner.next().equals("y")){
                continue;
            }else{
                break;
            }
        }
    }
    public static void verifyAnswersAndScore(String [] userAnswers,String[] answers,int score){
        for(int i = 0; i < userAnswers.length;i++){
            if (userAnswers[i].equals(answers[i])){
                System.out.println("Question "+ (i+1) + " correct!");
                score++;
            }else {
                System.out.println("Question "+ (i+1) + " incorrect!");
                System.out.println("Correct answer: " + answers[i]);
            }
        }
        System.out.println("You score has been = "+ score + " points!");
    }


}
