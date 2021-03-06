/**
 * 抽象装饰类
 */
public abstract class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDescrible() {
        return this.aBattercake.getDescrible();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
