package lanhanshi;


/**
 * 懒汉式
 */
public class SingletonDemo4 {
    public static void main(String[] args) {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton5 {
    /**
     * 防止指令重排
     * 变量共享可见
     * 非原子性
     */
    private static volatile Singleton5 instance;

    private Singleton5() {
    }

    /**
     * 提供一个静态的公共方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
     * 同时保证了效率，推荐使用
     */
    public static Singleton5 getInstance() {
        // 判断是否有了Singleton4对象
        if (instance == null) {
            // 同步锁
            synchronized (Singleton5.class) {
                // 保证单例
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
