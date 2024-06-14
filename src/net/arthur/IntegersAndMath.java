package net.arthur;

public class IntegersAndMath {
    public static void main(String[] args) {
        /* Integers & Math & Arithmetic Operators*/
        int x = 100;
        int y = 20;
        int result;

        //Addition
        result = x + y;
        System.out.println(result);

        //Subtraction
        result = x - y;
        System.out.println(result);

        //Multiplication
        result = x * y;
        System.out.println(result);

        //Division
        result = x / y; //  Slash  = /
        System.out.println(result);

        //Remainder or Modulo operator
        //Uses to verify if the number is even(par) or odd(ímpar)
        result = 20%2; // Mesma coisa que Mod (Remainder == Resto)
        System.out.println(result);

        //Math Methods
        System.out.println(Math.max(x,y)); // Return maximum value
        System.out.println(Math.abs(-555)); // |-555| = 555


    }
}
