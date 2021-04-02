/**
 * @author coderblue
 */
public class SmallPen extends Pen {

    /**
     * 着色方法：桥接模式的关键，组合实现和抽象
     */
    public SmallPen(Color color) {
        super(color);
    }

    @Override
    public void tinting() {
        System.out.println(super.color.colour() + "小号钢笔");
    }

}