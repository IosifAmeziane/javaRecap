package git;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("The main method is created");
        System.out.println("The main method is created");

        SecondClass secondClass = new SecondClass();
        secondClass.sayHello();
        System.out.println("Iosif Ameziane");

        ThirdClass thirdClass = new ThirdClass();

        System.out.println(secondClass.sayHello() + " " +  thirdClass.getName());

    }
}
