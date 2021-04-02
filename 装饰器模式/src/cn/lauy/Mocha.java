package cn.lauy;

/**
 * @author Lauy
 * @date 2021/3/31
 * Mocha是一个装饰着
 */
public class Mocha extends CondimentDecorator{

    /*让mocha引用一个Beberage，用一个实例变量记录饮料，也就是被装饰者*/
    private Beverage beverage;

    /*把饮料当作构造器的参数，再由构造器将此饮料记录在实例变量中*/
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /*计算Mocha饮料价格，首先调用委托给被装饰对象计算价格，然后加上Mocha的价钱*/
    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "搭配调料Mocha：";
    }

}
