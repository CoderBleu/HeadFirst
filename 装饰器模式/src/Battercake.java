/**
 * 煎饼类，继承了煎饼抽象类，一个煎饼 8 块钱（具体构件）
 */
public class Battercake extends ABattercake {

    @Override
    protected String getDescrible() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}