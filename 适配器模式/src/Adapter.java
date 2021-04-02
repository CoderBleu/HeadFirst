/**
 * @author coderblue
 */
public class Adapter implements Target {
    // 适配者是对象适配器的一个属性
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        System.out.println("Target目标方法");
        adaptee.adapteeRequest();
    }
}