package advanced.designPattern;

//public class ThreadClass extends Thread {
public class ThreadClass implements Runnable {

    public void run() {
        SingletonClass singletonClass = SingletonClass.getInstance();

        System.out.println(singletonClass);
    }
}
