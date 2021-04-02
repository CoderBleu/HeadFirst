package interfaces.impl;

import interfaces.FlyBehavior;

/**
 * @author Lauy
 * @date 2021/3/30
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
