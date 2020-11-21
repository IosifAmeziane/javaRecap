package fundamentals;

public class Animal {

    public String name;


    public Animal(String name) {
        this.name = name;
        System.out.println(name);
    }

    public static void walk() {
        System.out.println("Animal walks");
    }


}
