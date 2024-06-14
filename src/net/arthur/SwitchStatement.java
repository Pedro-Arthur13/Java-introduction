package net.arthur;

public class SwitchStatement {
    public static void main(String[] args) {
        //Switch Statement

        int medalPlacement = 1;

        //On switch statement we need to write every single specifically case
        // You can't use >= or another comparison operator like this
        // Never use floats in switch statements because they can lead to rounding issues
        switch (medalPlacement){
            case 1: System.out.println("Gold Medal"); break;
            case 2: System.out.println("Silver Medal"); break;
            case 3: System.out.println("Bronze Medal"); break;
            default: System.out.println("No Medal"); // Happens when no other cases have been called
        }

    }
}
