package net.arthur;


import java.util.Scanner;

public class ExceptionsTryCatch {
    public static void main(String[] args)  { // throws significa que a classe pode obter certos tipos de excessões
        /* Exceptions, Try and Catch */
        //Exception exemple: indexOutOfBound

        Scanner scanner = new Scanner(System.in); // in = input stream
        int i = scanner.nextInt();

//        checkForZero(i);

        try{
            checkForZero(i);
        }catch (Exception e){// vai ser chamado se uma excessao for lançada
            System.out.println(e.getMessage()); // Printa a mensagem de erro da execsao 'e' capturada
        }finally { // finally is always called
            System.out.println("Finally");
        }
        System.out.println("This happens always");

    }
    public static void checkForZero(int number) throws TestException {
        if (number == 0){
            throw new TestException("Can't do division by zero");
        }
    }

}
