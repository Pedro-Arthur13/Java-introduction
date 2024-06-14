package net.arthur;

import java.util.ArrayList;
import java.util.List;

public class InterfacesAndAbstracts {
    public static void main(String[] args) {
        /* Interfaces and Abstract Classes */

        //O que é o animal? Animal é um conceito abstrato
        // Therefore, se animal é um conceito abstrado nao podemos instaciar o animal
//        Animal animal = new Animal("Xx",'X',10);
        //Teria que ser assim
        Cat gatoLeproso = new Cat("Gato leproso",10,'M');

        // podemos criar uma List de interfaces
        List<IPettable> pets = new ArrayList<>();
        pets.add(gatoLeproso);
    }
}
