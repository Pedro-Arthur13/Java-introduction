package net.arthur;

import net.arthur.Bank.Person;

public class AnonymousClass {
    public static void main(String[] args){
        /* Anonymous class */

        // Normal instance of a class
        Person robert = new Person("Robert","jef",102);

        // Anonymous class:
        // Anonima porque nao tem nome
        Person manager = new Person("Josh","drake",102){// Uma classe que estedende a classe person


            @Override
            public String getFullName() {
                return "Manager " + super.getFullName();
            }
        };
        System.out.println(manager.getFullName());
        System.out.println(robert.getFullName());



    }


}
