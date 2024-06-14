package net.arthur;

public class dataTypes {
    public static void main(String[] args) {
        /* Data Types */
        // Number types

        //No java só fica laranja o tipo da variável se ela for do tipo primitivo
        //Ex: int
        int aNumber = 32; // Integer (ou número inteiro/whole number) [Vai de -2bi até +2bi]

        //Nesse caso float e doubble são quase a mesma coisa, mas não necessáriamente
        //Ambos são armazenados como notação ciêntífica tipo: 1.412 *10^4 = 14120

        float floatNomber = 13.24f; // When you need comma/ quando precisa de vírgula no número [7 decimal point of precision]
        double aDoubleNumber = 420.00005; // 15 decimal point of precision -> significa que maior que 15 numeros, esteja ele a esquerda ou a direirta da vírgula, irá ser arredondado

        byte aTinyNumber = 100; // Um número pequeno; One byte(or 8bits) stores numbers from [-128 to 127]
        short aSmallNumber = 30000; // stores numbers from [-32.768 to 32.767]
        long aLongNumber = 120312301; // Long (for really long numbers, coloca long nisso viu kkkkk)

        //Booleans (logical)

        boolean isThisJava = true; // Store either true(1) or false(0), pode ser representado por um bit

        //Chraracters and strings

        char aSingleCharacter = 'a'; // Stores a singles Character, uses single quotation('')
        String aString = "Hello world";//Store a sequence of characters, uses double quotation ("")
        String test = null; // null isn't 0, literally empty. has no value!



    }
}