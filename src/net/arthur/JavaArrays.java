package net.arthur;

public class JavaArrays {
    public static void main(String[] args) {
        // Java Arrays

        String question1 = "How many planets de we have in the solar system?";
        String question2 = "What are the nickname of the minecraft creator?";
        String question3 = "What is the first name of minecraft?";

        String answer1 = "8";
        String answer2 = "Notch";
        String answer3 = "Cave game";

        // Array != List
        // Creating an Array -> type[] nomeOfArray = new type[lengthOfTheArray] ([] -> brackets)
        String[] questions = new String[3]; // 3 elements of index = 0,1,2
        questions[0] = question1;
        questions[1] = question2;
        questions[2] = question3;
        System.out.println(questions[0]);

        String[] answers = new String[3]; // 3 elements of index = 0,1,2
        answers[0] = answer1;
        answers[1] = answer2;
        answers[2] = answer3;
        System.out.println(answers[0]);

        //We can reassign the elements of an array like this:
//        answers[0] = "10";
//        answers[0] = "310";

        System.out.println(questions.length);



    }
}
