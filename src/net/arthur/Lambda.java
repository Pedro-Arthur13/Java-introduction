package net.arthur;

import javax.print.attribute.standard.RequestingUserName;
import java.util.concurrent.Callable;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
        /* Lambda expressions */

        // "Functions as variables"
        // Supplier, Consumer, Callable, Runnable, Function

        // Supplier: no parameter and return value
        // () -> x
        Supplier<Integer> supplier = () -> {return 10; }; // Ou seja, esse supplier vai retornar um integer e nao precisa de parametros

        // Consumer: one parameter, but no return value
        // x -> ()
        Consumer<String> consumer = (x) -> {System.out.println(x);};// Um consumer de string nós passamos uma string e ele vai fazer algo com ela
        consumer.accept("Hello");

        // Callable: no parameter, and return value
        // () -> x throws exceptions
        Callable<Float> callble = () -> {return 10f/0f;};

        try {
            callble.call();
        }catch (Exception e){
            System.out.println(e);
        }

        // Runnable: no parameters and no return value
        // () -> ()
        Runnable runnable = () -> {System.out.println("Hello world again");};
        runnable.run();
        //Function: has parameters and return value
        // x -> y
        Function<Double,Double> function = (x) ->{return  x*Math.PI;};//Funtion <type of input, type of result>
        System.out.println(function.apply(10.0));

    }
}
