package net.arthur;

public class ClassesAndObjects {
    public static void main(String[] args) {
        /* Classes and Objects */

        Human Miguel = new Human("Miguel",'M',11); // New instance of the human class,
        // basically normal variable of type Human

        // We can do this:
//        Miguel.name = "Miguel";
        // This doesn't work because the age is private
//        Miguel.age = 12;

        // Or we can do this on the constructor, but in this case  it actually creates a new object
        Human Pedro = new Human("Pedro Arthur", 'M',15);
        System.out.println(Pedro.getAge());
        Pedro.MakeASound();
        // We can change the fields from anywhere and anytime because it's public
        // Miguel.age = 100000;

        System.out.println(Pedro.getAgeInDogYears());
    }
}
