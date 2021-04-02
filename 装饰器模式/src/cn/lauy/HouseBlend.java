package cn.lauy;

/**
 * @author Lauy
 * @date 2021/3/31
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "HouseBlend 饮料";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
