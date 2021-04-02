/**
 * 扩充抽象类
 */
public class MiddlePen extends Pen {

    /**
     * 着色方法：桥接模式的关键，组合实现和抽象
     */
    public MiddlePen(Color color) {
        super(color);
    }

    @Override
    public void tinting() {
        System.out.println(super.color.colour() + "中号钢笔");
    }
}