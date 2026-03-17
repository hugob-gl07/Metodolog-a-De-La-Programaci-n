package EJEMPLO;
//Clase abstracta Shape.
public abstract class Shape {
    protected String color = "red";
    protected boolean filled = true;
//Constructor vacío
    public Shape() {}
//Constructor, inicializa la clase con color y estableciendo que esta rellena
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
//Métodos que componen nuestra clase abstracta:
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
//Estos métodos seran implementados de forma distinta en las clases hijas.
    public abstract double getArea();
    public abstract double getPerimeter();
//ToString para devolver por pantalla el color y el relleno de la clase Shape.
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
