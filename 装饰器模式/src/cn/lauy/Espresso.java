package cn.lauy;

/**
 * @author Lauy
 * @date 2021/3/31
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso 饮料";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
