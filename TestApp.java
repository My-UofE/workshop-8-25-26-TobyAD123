public class TestApp {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(50, 60, 10, 15);
        System.out.println(m1);

        m1.moveLeft();
        m1.moveDown();
        System.out.println(m1);
    }
}