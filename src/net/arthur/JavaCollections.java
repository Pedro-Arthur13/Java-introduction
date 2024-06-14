package net.arthur;

import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        /* ArrayList, Maps, Sets(collections) */

        String[] questions = new String[2];

        questions[0] = "What is weebe waboo?";
        questions[1] = "Say my name: ";


        //Declaring a new ArrayList
        List<String> questionList = new ArrayList<>();
        //We don't need to define the length of the arrayList, because the list expand dynamically when we add elements
        questionList.add("Who am i?");
        questionList.add("Who are you?");

        questionList.remove(0);

        //For ArrayList we use .size() to get the length
        System.out.println(questionList.size());
        //To get any element of the list we need use the .get(indexOfTheElement)
        System.out.println(questionList.get(0));

        // List<int> numbers = new ArrayList<>(); --> this will not work, because we can't have an ArrayList
        // with primitive types

        // Teremos que usar os tipos de dados chamados wrapper classes
        List<Integer> numbers = new ArrayList<>(); // Podemos usar qualquer tipo de dado aqui desde que nao seja primitivo
        // No exemplo acima estamos usando generics (seriam as angle brackets <>)

        // Maps
        // Map contains a Key and a Value (tipo um dicionario do python)
        // Key-value pair
        Map<String, String> paisParaCapital = new HashMap<>();
        // To put something inside a HashMap we need to use the .put("Key","Value"); method
        paisParaCapital.put("Germany", "Berlin");
        paisParaCapital.put("France", "Paris");
        paisParaCapital.put("Italy", "Rome");
        // We use same method .get() to get an element from a HashMap
        System.out.println(paisParaCapital.get("Germany"));

        // .contains() will return a boolean
        System.out.println("Contains Key 'Germany'? " + (paisParaCapital.containsKey("Germany") ? "Yes" : "No"));
        System.out.println("Contains value 'London'? " + (paisParaCapital.containsValue("London") ? "Yes" : "No"));

        //Removing things from a map
        // Pode tanto remover apenas a key, aí vai retornar uma String
        // Ou poder remover a Key e o Value, retornando um boolean, pelo caso de o key-value pair nao estar certo
        System.out.println(paisParaCapital.remove("France"));


        //Sets
        //Sets are collections that contains no duplicates
        Set<String> nicknames = new HashSet<>();
        nicknames.add("Pepino");
        nicknames.add("Pedro");
        System.out.println(nicknames.add("Robesvaldo o ladrão de chocolate")); // Returns true
        System.out.println(nicknames.add("Robesvaldo o ladrão de chocolate")); // Returns false



    }
}

