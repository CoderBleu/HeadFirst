/**
 * @author coderblue
 */
public abstract class Pen {

    protected Color color;

    /**
     * 桥接模式的关键，组合实现和抽象
     */
    public Pen(Color color) {
        this.color = color;
    }

    /**
     * 着色方法
     */
    public abstract void tinting();
}