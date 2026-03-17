package EJEMPLO;
//Clase hija de la clase abstracta Shape
public class Circle extends Shape {
    protected double radius = 1.0;
//Constructores:
    public Circle() {}//Constructor vacío
    public Circle(double radius) { this.radius = radius; } //Constructor simple (solo con el elemento propio de circulo
    public Circle(double radius, String color, boolean filled) {//Constructor extendido, agrega los datos protegidos de la clase Shape
        super(color, filled);
        this.radius = radius;
    }
//Getter y Setter
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
//Método abstracto adaptado a la clase circulo.
    @Override
    public double getArea() { return Math.PI * radius * radius; }
//Método abstracto adaptado a la clase circulo.
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
//Extiende el ToString de la clase abstracta, devuelve por pantalla el radio, el color y el relleno.
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
