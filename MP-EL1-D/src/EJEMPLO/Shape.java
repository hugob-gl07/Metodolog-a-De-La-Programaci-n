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
    public String getColor() { return color; }//Getter
    public void setColor(String color) { this.color = color; }//Setter
    public boolean isFilled() { return filled; }//Método que trabaja con el tipo básico bool (True/False)
    public void setFilled(boolean filled) { this.filled = filled; }//Setter que establece una relación con el método isFilled
//Estos métodos seran implementados de forma distinta en las clases hijas, al estar en la clase abstracta, lo especificamos
    //escribiendo abstract, también indicamos en el tipo básico de datos en el que vamos a trabajar.
    public abstract double getArea();
    public abstract double getPerimeter();
//ToString para devolver por pantalla el color y el relleno de la clase Shape.
    //Destacamos que devuelve el tipo básico string por pantalla.
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
