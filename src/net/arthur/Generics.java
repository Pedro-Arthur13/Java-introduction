package net.arthur;

public class Generics {
    public static void main(String[] args) {
        /* Generics */

        Pair<?,Float> test = new Pair<>("Pedro",10.0f); // wild card generic, ele vai associar automaticamente o tipo de dado
        Pair<Integer,Float> test2 = new Pair<>(100,10.231f);

    }
}
