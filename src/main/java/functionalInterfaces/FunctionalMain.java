package functionalInterfaces;

import java.util.function.*;

public class FunctionalMain {


    public static void main(String[] args) {
        // Function : input -> output
        Function<String, Integer> function = s -> s.length();
        Integer result = function.apply("stringParametru");
        System.out.println(result);

        Function<String, Integer> function2 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(function2.apply("stringParametru"));

        //Predicate : primeste un input si returneaza un boolean
        Predicate<Integer> predicate = integer -> integer > 10;
        System.out.println(predicate.test(15));


        //Consumer: input -> ()
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("consumer");


        //Supplier: () -> output
        Supplier<Double> supplier = () -> {
            double x = Math.random();
            System.out.println(x);
            return x;
        };
        supplier.get();


        //BinaryOperator: input, input -> output
        BinaryOperator<Integer> binaryOperator = (x, y) -> x+y;
        System.out.println(binaryOperator.apply(5, 7));


    }
}
