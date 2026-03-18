package BloqueB.MyCirclePackage;

public class MyCircle {/** indicamos las variables que vamos a usar, cogiendo el center de la clase MyPoint*/
    private MyPoint center;
    private int radius = 1;


    public MyCircle(MyPoint center, int radius) {/** definimos las variables*/
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() { return radius; } /** aplicamos los getter y setter que nos permitiran usar los datos y saltarnos datos  */
    public void setRadius(int radius) { this.radius = radius; }
    public MyPoint getCenter() { return center; }
    public void setCenter(MyPoint center) { this.center = center; }

    public int getCenterX() { return center.getX(); }
    public void setCenterX(int x) { center.setX(x); }
    public int getCenterY() { return center.getY(); }
    public void setCenterY(int y) { center.setY(y); }
    public int[] getCenterXY() { return center.getXY(); }
    public void setCenterXY(int x, int y) { center.setXY(x, y); }

    public double getArea() { /** introducimos la biblioteca math que nos permite usar pi para calcular el area y la circunferencia*/
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {/** introducimos el distance, el cual resta los puntos mayores a los menores y nos da el resultado siendo este la distancia entre ambos*/
        return center.distance(another.center);
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center + "]";
    }
}
