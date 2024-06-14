package net.arthur;

public class StringAndStringMethods {
    public static void main(String[] args) {
        /* String and String-Methods */

        String sentence = "It's a wonderful java course";
        System.out.println(sentence);
        System.out.println("Length is "+sentence.length() + " characters");

        // Os metodos as seguir retornam uma especie de copia da varivavel, ou seja,
        // Esses metodos nao alteram a variavel por si
        System.out.println("SHOUTING "+sentence.toUpperCase()); // SHOUTING(gritando) = TURN THE STRING TO UPPER CASE
        System.out.println("whispering "+sentence.toLowerCase()); // whispering(sussurando) + turn the string to lower case

        // Index of a element
        System.out.println("The word 'java' is found at position: "+ sentence.indexOf("java"));

        // Replace
        System.out.println(sentence.replace("java","minecraft"));

        //Starts and Ends with
        System.out.println(sentence.startsWith("I"));
        System.out.println(sentence.endsWith("e"));

        //Verifying if a string is empty
        String s = "";
        boolean stringEmpty = s.isEmpty();
        System.out.println(stringEmpty);

        //Contains
        System.out.println(sentence.contains("java"));

        // chartAt
        System.out.println(sentence.charAt(17));

        // substring
        System.out.println(sentence.substring(17,22));

        

    }
}
