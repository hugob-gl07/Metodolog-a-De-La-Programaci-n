package BloqueB.MyPointTestPackage;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MyPointTest {

    @Test
    public void testConstructorsAndGetters() {
        MyPoint p1 = new MyPoint();
        assertEquals(0, p1.getX());
        assertEquals(0, p1.getY());

        MyPoint p2 = new MyPoint(3, 4);
        assertEquals(3, p2.getX());
        assertEquals(4, p2.getY());
    }

    @Test
    public void testSetters() {
        MyPoint p = new MyPoint();
        p.setXY(5, 6);
        int[] xy = p.getXY();
        assertEquals(5, xy[0]);
        assertEquals(6, xy[1]);
    }

    @Test
    public void testDistance() {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);


        assertEquals(5.0, p1.distance(p2), 0.001);
        assertEquals(5.0, p1.distance(3, 4), 0.001);
        assertEquals(5.0, p2.distance(), 0.001);
    }
}
