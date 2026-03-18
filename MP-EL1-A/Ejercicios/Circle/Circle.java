package Ejercicios.Circle;
/**
 * Representa un círculo con un radio.
 */
public class Circle {
    private double radius= 1.0f;
/** Constructor por defecto */
    public Circle(){}
/** Constructor con radio dado. */
    public Circle(double radius){
        this.radius=radius;
    }
/** Devuelve el radio del círculo. */
    public double getRadius() {
        return radius;
    }
/** Modifica el radio del círculo.*/
    public void setRadius(double radius) {
        this.radius = radius;
    }
/** Calcula y devuelve el área del círculo.*/
    public double getArea(){
        return Math.PI*radius*radius;
    }
/** Calcula y devuelve la circuferencia del círculo.*/
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
/** Devuelve una representación en texto del círculo. */
    public String toString() {
        return "Circle.Circle[radius= " + radius + "]";
    }
}
