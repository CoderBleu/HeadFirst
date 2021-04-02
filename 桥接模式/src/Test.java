public class Test {
    public static void main(String[] args) {
        // 绿色的中号钢笔
        Pen middlePen = new MiddlePen(new Green());
        middlePen.tinting();
        // 红色的小号钢笔
        Pen smallPen = new SmallPen(new Red());
        smallPen.tinting();
    }
}
