package interface_adaptee;

public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            //只需要去覆盖我们 需要使用 接口方法
            @Override
            public void run1() {
                System.out.println("使用了 run1 的方法");
            }
        };
        absAdapter.run1();
        absAdapter.run2();
        absAdapter.run2();
    }
}
