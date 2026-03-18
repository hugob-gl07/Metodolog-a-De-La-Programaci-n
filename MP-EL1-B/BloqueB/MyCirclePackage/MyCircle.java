package BloqueB.MyCirclePackage;

/**
 * Representa un círculo con centro (MyPoint) y radio.
 */
public class MyCircle {  /** Definimos la clase MyCircle con sus atributos principales. */

private MyPoint center;  // Centro del círculo (objeto MyPoint)
    private int radius = 1;  // Radio del círculo (inicialmente 1)
    /** Constructor con centro y radio del círculo. */
    public MyCircle(MyPoint center, int radius) {
        this.center = center;  // Guardamos el centro del círculo
        this.radius = radius;  // Guardamos el radio del círculo
    }
    /** Devuelve el radio del círculo. */
    public int getRadius() {
        return radius;  // Devolvemos el radio del círculo
    }

    /** Modifica el radio del círculo. */
    public void setRadius(int radius) {
        this.radius = radius;  // Actualizamos el radio del círculo
    }

    /** Devuelve el centro del círculo. */
    public MyPoint getCenter() {
        return center;  // Devolvemos el objeto centro
    }

    /** Modifica el centro del círculo. */
    public void setCenter(MyPoint center) {
        this.center = center;  // Actualizamos el centro del círculo
    }

    /** Devuelve la coordenada X del centro. */
    public int getCenterX() {
        return center.getX();  // Obtenemos la X usando el getter de MyPoint
    }

    /** Modifica la coordenada X del centro. */
    public void setCenterX(int x) {
        center.setX(x);  // Actualizamos la X usando el setter de MyPoint
    }

    /** Devuelve la coordenada Y del centro. */
    public int getCenterY() {
        return center.getY();  // Obtenemos la Y usando el getter de MyPoint
    }

    /** Modifica la coordenada Y del centro. */
    public void setCenterY(int y) {
        center.setY(y);  // Actualizamos la Y usando el setter de MyPoint
    }

    /** Devuelve las coordenadas X e Y del centro como array. */
    public int[] getCenterXY() {
        return center.getXY();  // Obtenemos el array XY de MyPoint
    }

    /** Modifica las coordenadas X e Y del centro. */
    public void setCenterXY(int x, int y) {
        center.setXY(x, y);  // Actualizamos ambas coordenadas usando MyPoint
    }

    /** Devuelve el área del círculo (π * radio²). */
    public double getArea() {
        return Math.PI * radius * radius;  // Calculamos el área usando la fórmula matemática
    }

    /** Devuelve la circunferencia del círculo (2 * π * radio). */
    public double getCircumference() {
        return 2 * Math.PI * radius;  // Calculamos la circunferencia usando la fórmula matemática
    }

    /** Devuelve la distancia entre este círculo y otro (distancia entre centros). */
    public double distance(MyCircle another) {
        return center.distance(another.center);  // Calculamos la distancia entre centros usando MyPoint
    }

    /** Devuelve una representación en texto del círculo. */
    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center + "]";  // Concatenamos radio y centro formateados
    }
}
