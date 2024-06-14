package net.arthur;

import java.util.Scanner;

public class ExceptionsCalculatorTest extends ExceptionsTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the numerator: ");
        int i = scanner.nextInt();
        int y;
        while (true) {

            System.out.println("Insert the denominator: ");
            y = scanner.nextInt();
            if (DivisionByZero(y)) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("Result: " + i + "/"+ y+" = "+ i/y);

    }
    public static boolean DivisionByZero(int i){
        try{
            checkForZero(i);
        }catch (Exception e){// vai ser chamado se uma excessao for lançada
            System.out.println(e.getMessage());
            return false;
        }
        return true;

    }
}
