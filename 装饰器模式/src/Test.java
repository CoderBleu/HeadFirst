public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake = new Battercake();
        // 1.购买一个煎饼：煎饼, 销售价格: 8
        System.out.println(aBattercake.getDescrible() + ", 销售价格: " + aBattercake.cost());

        // 2.购买一个加鸡蛋的煎饼：煎饼 加一个鸡蛋, 销售价格: 9
        aBattercake = new EggDecorator(aBattercake);
        System.out.println(aBattercake.getDescrible() + ", 销售价格: " + aBattercake.cost());

        // 3.购买一个加两个鸡蛋和一根香肠的煎饼： 煎饼 加一个鸡蛋 加一个鸡蛋 加一根香肠, 销售价格: 12
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDescrible() + ", 销售价格: " + aBattercake.cost());
    }
}
