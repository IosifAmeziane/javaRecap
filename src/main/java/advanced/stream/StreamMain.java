package advanced.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        // stream creation

        String[] names = {"Ana", "Maria", "Georgiana"};
        Stream<String> stream1 = Arrays.stream(names);
        stream1.forEach(s -> System.out.println(s));

        Stream<String> stream2 = Stream.of("Iosif", "Andrei", "Iulian");

        // iterations

        Boolean isStatingWithI = stream2.anyMatch(s -> s.startsWith("I"));
        System.out.println(isStatingWithI);

        ArrayList<String> names2 = new ArrayList<>(Arrays.asList(names));
        System.out.println(names2.stream().allMatch(s -> s.length() > 5));

        // filtering

        List<String> namesWithI = names2.stream().filter(s -> s.contains("i")).collect(Collectors.toList());
        System.out.println(namesWithI);


        // mapping
        List <Integer> namesLength = names2.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(namesLength);

        List <String> namesConcatenate = names2.stream().map(s -> s + " are mere").collect(Collectors.toList());
        System.out.println(namesConcatenate);

        // reduction

        int length = namesLength.stream().reduce(0, (x,y) -> x+y);
        System.out.println(length);

        int lengthSum = names2.stream().collect(Collectors.summingInt(s -> s.length()));
        System.out.println(lengthSum);

        /*int lengthSum1 = names2.stream().reduce(0, Integer::sum);
        System.out.println(lengthSum1);*/

        // method reference ,
        List<String> namesToUpperCase = names2.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(namesToUpperCase);

        List<String> namesToUpperCase2 = names2.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(namesToUpperCase2);

    }


}
