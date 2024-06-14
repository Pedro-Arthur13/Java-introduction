package net.arthur;

public class TernaryOperator {
    public static void main(String[] args) {
        //  Ternary operator

        int exam = 89;
        int gift = 0;
//
//        if(exam >= 50){
//            gift = 10;
//        }else {
//            gift = 0;
//        }

        // Ternary operator --> ?(question mark)
        gift = exam>=50 ? 10 : 0; // if the exam >= the gift is equal 10, else = 0
        System.out.println(gift);
    }
}
