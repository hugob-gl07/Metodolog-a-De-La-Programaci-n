package Ejercicios.Shape;
/**
 * Representa un círculo como subclase de Shape, añadiendo radio.
 */
public class Circle extends Shape {
    private double radius=1.0;
    /** Constructor por defecto.*/
    public Circle(){}
    /** Constructor con radio dado.*/
    public Circle(double radius){
        this.radius=radius;
    }
    /** Constructor con radio, color y relleno dados.*/
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    /** Devuelve el radio del círculo.*/
    public double getRadius() {
        return radius;
    }
    /** Modifica el radio del círculo.*/
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /** Calcula y devuelve el área del círculo.*/
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    /** Calcula y devuelve el perímetro del círculo.*/
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    /** Devuelve una representación en texto del círculo.*/
    @Override
    public String toString() {
        return "Circle"+ super.toString() + ",radius= " + radius + "]";
    }
}