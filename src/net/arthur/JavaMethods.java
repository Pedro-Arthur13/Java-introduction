package net.arthur;

public class JavaMethods {
    public static void main(String[] args) {
        //Java Methods

        String[] questions = new String[3]; // 3 elements of index = 0,1,2
        questions[0] = "How many planets de we have in the solar system?";
        questions[1] = "What are the nickname of the minecraft creator?";
        questions[2] = "What is the first name of minecraft?";

        String[] answers = new String[3]; // 3 elements of index = 0,1,2
        answers[0] = "8";
        answers[1] = "Notch";
        answers[2] = "Cave game";

        outputAnswersAndQuestions(questions,answers);
        System.out.println(sum(10,13));

    }

    // access modifiers(public static), the return type(void), name of the method,
    // method signature( type of parameter parameter(String[] questions))
    public static void outputAnswersAndQuestions(String[] questions, String[] answers){
        // void is the type of return of this method, so this method doesn't return nothing
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }
    }

    //Method overloading, quando um metodo ja existe e voce cria outro com o mesmo nome,
    // mas com method signature(parametros) diferente
//    public static void outputAnswersAndQuestions(String[] questions){
//        // void is the type of return of this method, so this method doesn't return nothing
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println(questions[i]);
//        }
//    }

    public static int sum(int x, int y){
        return x+y;
    }
}
