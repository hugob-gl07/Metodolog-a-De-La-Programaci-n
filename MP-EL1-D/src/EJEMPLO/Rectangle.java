package EJEMPLO;
//Clase rectangulo, extiende a la clase abstracta Shape
public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;
//Constructores:
    public Rectangle() {}//Constructor vacío
    public Rectangle(double width, double length) {//Constructor simple: implementa los elementos propios de rectangulo.
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {//Constructor extendido: añade los elementos de la clase abstracta
                                                                                 //y los elementos de la clase hija (width y length)
        super(color, filled);
        this.width = width;
        this.length = length;
    }
//Getters y Setters
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
//
    @Override
    public double getArea() { return width * length; }

    @Override
    public double getPerimeter() { return 2 * (width + length); }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}
