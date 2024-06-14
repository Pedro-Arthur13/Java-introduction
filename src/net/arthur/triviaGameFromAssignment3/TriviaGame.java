package net.arthur.triviaGameFromAssignment3;

import java.util.*;

public class TriviaGame {
    List<trivia> trivias = new ArrayList<>();
    List<Integer> allScores = new ArrayList<>();

    int[] BestScores = new int[3];
    Scanner scanner = new Scanner(System.in);
    public void start(){
        welcome();
        addQuestionsAndAnswers(trivias);
        gameLoop();
    }


    public void gameLoop(){
        while (true){
            int score = 0;
            for(trivia trivia:trivias ){//for each trivia in trivias
                trivia.printQuestion();
                String userInput = scanner.nextLine();
                if(trivia.verifyAnswer(userInput)){
                    score++;

                }
                trivia.resultado(userInput);
            }
            System.out.println("Your score: " + score);
            saveScore(score);
            verifyScoreBest(score);
            askAgain();

        }
    }
    public void askAgain(){
        System.out.println("Do you wanna still playing? (Y/N)");
        boolean exitOrNo = ((scanner.nextLine()).toLowerCase()).equals("y");
        if(!exitOrNo){
            exitGame();

        }else if(exitOrNo){
            System.out.println("Ok, let's go again");
        }
        }
    public void saveScore(int score){
        allScores.add(score);
    }
    public void verifyScoreBest(int score){
        for(int i = 0; i < BestScores.length; i++){
            if (score >= BestScores[i]){
                int temp = BestScores[i];
                int temp2 = BestScores[1];
                BestScores[i] = score;
                if (temp > BestScores[i+1]){
                    BestScores[i+1] = temp;
                }
                if (temp2 > BestScores[2]){
                    BestScores[2] = temp2;
                }

                break;
            }
        }
        System.out.println("3 Best scores:" );
        for (int i = 0; i < BestScores.length; i++){
            System.out.println((i+1) + "° Place " + BestScores[i] );


        }
    }

    public void exitGame(){
        System.out.println("Ok, good bye!");
        System.exit(1);
    }
    public void welcome(){

        System.out.println("Welcome to the Trivia Quiz!\n" +
                "\n" +
                "Test your knowledge with a series of fun and challenging questions. Answer each question correctly to earn points and see how high you can score!\n" +
                "\n" +
                "Are you ready? Let's begin!");
    }

    public void addQuestionsAndAnswers(List<trivia> list){

        trivias.add(new trivia("How many continents are there in the world?", "7"));
        trivias.add(new trivia("What is the tallest mountain in the solar system?", "Mount Olympus (on Mars)"));
        trivias.add(new trivia("Who wrote the play 'Romeo and Juliet'?", "William Shakespeare"));
        trivias.add(new trivia("What is the longest river in the world?", "Amazon River"));

        trivias.add(new trivia("What is the capital of Australia?", "Canberra"));
        trivias.add(new trivia("How many legs does an arachnid have?", "8"));
        trivias.add(new trivia("Who painted the Mona Lisa?", "Leonardo da Vinci"));
        trivias.add(new trivia("What is the largest organ in the human body?", "Skin"));


        Collections.shuffle(trivias);// reorganizando aleatoriamente as perguntas

    }
}
