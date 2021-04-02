import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

/**
 * @author Lauy
 * @date 2021/3/30
 */
public abstract class Duck {

    public void swim() {
        System.out.println("这是我们共同的特征，都会游泳");
    }

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
