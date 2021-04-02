import interfaces.FlyBehavior;
import interfaces.QuackBehavior;
import interfaces.impl.FlyWithWings;
import interfaces.impl.MuteQuack;

/**
 * @author Lauy
 * @date 2021/3/30
 */
public class FlyDuck extends Duck {

    public FlyDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack() ;
    }

    public void display() {
        System.out.println("I'm a real Fly and mute Duck");
    }

}
