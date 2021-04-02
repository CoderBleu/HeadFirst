package cn.lauy;

/**
 * @author Lauy
 * @date 2021/3/31
 * 饮料
 */
public abstract class Beverage {

    /*setDescription()已经在此实现了*/
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /*必须在子类中实现*/
    public abstract double cost();
}
