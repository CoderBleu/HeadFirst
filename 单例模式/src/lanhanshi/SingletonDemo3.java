package lanhanshi;


/**
 * 懒汉式(线程不安全)
 * 1.起到了懒加载效果，但仅限于单线程下
 * 2.如果在多线程下执行，很有可能会产生多个实例
 * 3.实际开发中，不推荐使用
 */
public class SingletonDemo3 {
    public static void main(String[] args) {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    /**
     * 提供一个静态的公共方法，当使用到该方法时，才会去创建instance
     * 可以加synchronized锁上方法，但是效率太低
     */
    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
