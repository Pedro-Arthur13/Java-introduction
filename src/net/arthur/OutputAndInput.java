package net.arthur;

import java.util.Scanner;

public class OutputAndInput {
    public static void main(String[] args) {
        // Outputting with println and inputting with Scanner

        System.out.println("Hello World, this is the output");//print line
        int x = 10;
        System.out.println("X = "+ x);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your username: ");
        String input = scanner.next(); // the variable input will store the input from the user
        System.out.println("Hello "+ input);
    }
}
