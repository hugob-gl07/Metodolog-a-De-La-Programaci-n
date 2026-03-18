package BloqueB.MyCirclePackage;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(1, 1, 5);
        System.out.println(c1);
        System.out.printf("Area: %.2f%n", c1.getArea());
        System.out.printf("Circumference: %.2f%n", c1.getCircumference());

        MyCircle c2 = new MyCircle(new MyPoint(4, 5), 2);
        System.out.println("Distance between circles: " + c1.distance(c2));
    }
}
