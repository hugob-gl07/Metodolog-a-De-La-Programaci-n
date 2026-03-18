package Ejercicios.GeometricObject;

// La clase Circle "promete" cumplir con el contrato de GeometricObject.
public class Circle implements GeometricObject {
    // Atributo privado para proteger el estado interno (Encapsulamiento).
    private double radius; 

    // Constructor que inicializa la propiedad fundamental de la figura.
    public Circle(double radius) { 
        this.radius = radius; 
    } 

    // Implementación obligatoria del área usando la constante Math.PI. y usando la formula (Math.PI*Radio*radio)
    //Devuelve el área del circulo en formato del tipo básico double.
    @Override
    public double getArea() { 
        return Math.PI * radius * radius; 
    } 

    // Implementación del perímetro (longitud de la circunferencia).
    @Override
    public double getPerimeter() { 
        return 2 * Math.PI * radius; 
    } 

    // Representación textual del objeto para facilitar la depuración.
    @Override
    public String toString() { 
        return "Circle[radius=" + radius + "]"; 
    } 
}
