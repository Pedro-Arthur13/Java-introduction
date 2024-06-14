package net.arthur;

import java.util.ArrayList;
import java.util.List;

public class InheritanceAndPolymorphism {
    public static void main(String[] args) {
        /* Inheritance And Polymorphism */

        Human Edjania = new Human("Edjania Mamae",'F',41);

        Cat godofredo = new Cat("Godofredo",2,'M');

        System.out.println(godofredo.getAge());
        godofredo.MakeASound();

        //Polymorphism
        // UM cachorro é animal e cachorro ao mesmo tempo
        Animal animal = new Cat("Roberto",1,'M');
        // Ou seja ele toma multiplas formas,
        animal.MakeASound(); // Retorna meow porque no fundo ele ainda é um gato

        List<Animal> animals = new ArrayList<>();
        animals.add(godofredo);
        animals.add(Edjania);
        animals.get(0).MakeASound();

    }
}
