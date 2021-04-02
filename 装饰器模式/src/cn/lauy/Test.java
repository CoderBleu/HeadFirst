package cn.lauy;

/**
 * @author Lauy
 * @date 2021/3/31
 */
public class Test {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());
        espresso = new Mocha(espresso);
        System.out.println("espresso：" + espresso.getDescription() + " $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        System.out.println("houseBlend：" + houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
