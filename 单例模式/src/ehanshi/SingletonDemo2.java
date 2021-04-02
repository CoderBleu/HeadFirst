package ehanshi;

/**
 * 饿汉式(静态变量)
 */
public class SingletonDemo2 {
    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
    }

}

class Singleton2 {
    // 1.构造器私有化，外部能new
    private Singleton2() {

    }

    // 2.本类内部创建对象实例
    private static Singleton2 instance;

    // 静态代码块中实例化对象
    static {
        instance = new Singleton2();
    }

    // 3.提供一个公用的静态方法，返回实例对象
    public static Singleton2 getInstance() {
        return instance;
    }

}


