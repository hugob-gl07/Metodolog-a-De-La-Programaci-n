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
// Implementación del cálculo del área. 
    // Se utiliza la constante Math.PI de Java para obtener la máxima precisión decimal.
    // La fórmula aplicada es (π * r²), esencial para cumplir con el contrato de Shape.
    //Devuelve el área de nuestro circulo como el tipo básico de dato double.
    @Override
    public double getArea() { return Math.PI * radius * radius; }
// Implementación del cálculo del perímetro (longitud de la circunferencia).
    // Se sobreescribe el método abstracto original para adaptarlo a la geometría
    // específica del círculo usando la fórmula: 2 * π * radio.
    //Devuelve el perímetro de nuestro circulo como el tipo básico de dato double.
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
// El método toString se ha diseñado de forma modular. 
    // Al llamar a super.toString(), recuperamos la descripción de color y relleno
    // que ya gestiona la clase Shape, y simplemente le "añadimos" el radio.
    // Esto es un ejemplo claro de reutilización de comportamiento heredado.
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
