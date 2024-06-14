package net.arthur;

public class casting {
    public static void main(String[] args) {
        /* Casting / Converting data types between each other */

        int loan = 750; // loan = Impréstimo
        float interestedRate = 0.0525f; // interested rate = taxa de juros

        float interested = loan * interestedRate; // --> Implicit cast
        // When we multiply an int times a float, in the background the integer was converted to float
        // Like this: float interested = (float)loan * interestedRate; --> Explicit cast
        System.out.println(interested);

        // casting in  integer
        // All after the decimal point is cut off in this case:
        int IntInterested = loan * (int)interestedRate; // this will be equals 0, because the float who was 0.0525 now is 0, and every number times 0 is equals 0
        System.out.println(IntInterested);


    }
}
