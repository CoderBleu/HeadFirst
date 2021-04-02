package cn.lauy;

/**
 * @author Lauy
 * @date 2021/3/31
 */
public abstract class CondimentDecorator extends Beverage {

    /*所有的调料装饰者都必须重新实现此方法*/
    @Override
    public abstract String getDescription();
}
