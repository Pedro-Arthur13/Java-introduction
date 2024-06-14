package net.arthur;

public class BolleanAndLogicalOperators {
    public static void main(String[] args) {
        /* Boolean and Logical Operators */

        // && (and)
        // !  (not)
        // || (or)

        boolean finishedTheAssignments = false;
        boolean askedQuestion = false;
        boolean watchedTheLectures = true;
        boolean gaveReview = true;

        boolean finishedTheCourse = finishedTheAssignments && watchedTheLectures;
        boolean isFan = finishedTheCourse && gaveReview;
        boolean learning = watchedTheLectures || askedQuestion;


    }
}
