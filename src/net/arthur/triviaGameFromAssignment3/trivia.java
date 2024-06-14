package net.arthur.triviaGameFromAssignment3;

public class trivia {
    // Cada trivia vai ser uma dupla de resposta e questao
    // Aqui também teremos os methods e a logica
    String question;
    String answer;

    public trivia (String question, String answer){
        this.question = question;
        this.answer = answer;
    }
    public void printQuestion(){
        System.out.println(question);
    }

    public boolean verifyAnswer(String userInput){
        String LowerUserInput = userInput.toLowerCase();
        return LowerUserInput.equals(this.answer.toLowerCase());
    }

    public void resultado(String userInput){
        boolean valid = verifyAnswer(userInput);
        String acertou = "Correct answer";
        String errou = "WRONG!!!!!!!!! The correct answer is " + this.answer;
        String result = valid ? acertou: errou;
        System.out.println(result);
    }

}
