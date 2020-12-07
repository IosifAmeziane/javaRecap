package advanced.designPattern;

public class SingletonClass {

    private static SingletonClass singletonClass;

    public SingletonClass() {
    }

    public synchronized static SingletonClass getInstance() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
