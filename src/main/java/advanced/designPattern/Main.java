package advanced.designPattern;

public class Main {

    public static void main(String[] args) {
/*
        SingletonClass singletonClass= SingletonClass.getInstance();
        System.out.println(singletonClass);

        SingletonClass singletonClass1= SingletonClass.getInstance();
        System.out.println(singletonClass1);*/


        //adrese diferite pentru ca instantele nu sunt ThreadSafe, daca nu are syncronized
        /*ThreadClass threadClass1 = new ThreadClass();
        ThreadClass threadClass2 = new ThreadClass();
        threadClass1.start();
        threadClass2.start();*/

        ThreadClass threadClass1 = new ThreadClass();
        ThreadClass threadClass2 = new ThreadClass();
        Thread thread1 = new Thread(threadClass1);
        Thread thread2 = new Thread(threadClass2);
        thread1.start();
        thread2.start();


    }
}
