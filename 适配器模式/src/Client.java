/**
 * @author coderblue
 */
public class Client {
    public static void main(String[] args) {
        Target adapterTarget = new Adapter();
        adapterTarget.request();
        // 输出：concreteTarget目标方法
        //       被适配者的方法
    }
}
