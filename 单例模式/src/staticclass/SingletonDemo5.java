package staticclass;


/**
 * 静态内部类，推荐使用
 */
public class SingletonDemo5 {
    public static void main(String[] args) {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println("静态内部类，推荐使用:" + (instance1 == instance2));
    }
}

class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {
    }

    /**
     * 提供一个静态代码类，里面有静态属性
     */
    private static class SingletonInstance {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    /**
     * 提供一个静态的公共方法，直接返回SingletonInstance.INSTANCE
     */
    public static Singleton5 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
