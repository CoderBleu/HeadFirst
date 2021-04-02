package interfaces.impl;

import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

/**
 * @author Lauy
 * @date 2021/3/30
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        // 什么也不做，不会叫
    }
}
