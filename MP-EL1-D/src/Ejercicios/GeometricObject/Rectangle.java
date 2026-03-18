package Ejercicios.GeometricObject;

// Al igual que Circle, Rectangle implementa la misma interfaz, 
// permitiendo que ambos sean tratados de forma polimórfica.
public class Rectangle implements GeometricObject {
    private double width;//Atributo 1
    private double length;//atributo 2

    // Constructor para definir las dos dimensiones necesarias.
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    } 

    // Cálculo de superficie adaptado a la geometría rectangular, emplea la operación "width*length".
    //Devuelve por pantalla el área del rectangulo en forma del tipo básico double
    @Override
    public double getArea() { 
        return width * length; 
    }

    // Cálculo del contorno sumando los cuatro lados, es decir, usando la formula "2*(width + length)".
     //Devuelve por pantalla el perímetro del rectangulo en forma del tipo básico double.
    @Override
    public double getPerimeter() { 
        return 2 * (width + length); 
    }

    //Devuelve por pantalla los atgribbutos de dicho rectangulo (width y length).
    //Dicha información se imprime por pantalla en forma de tipo básico string.
    @Override
    public String toString() { 
        return "Rectangle[width=" + width + ", length=" + length + "]"; 
    }
}
