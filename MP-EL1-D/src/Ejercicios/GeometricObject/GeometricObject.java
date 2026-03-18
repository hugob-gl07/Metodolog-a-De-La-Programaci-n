package Ejercicios.GeometricObject;

// Una interfaz define un "contrato" de comportamiento.
// No almacena datos, solo declara qué métodos deben implementar las clases hijas.
public interface GeometricObject {
    // Método abstracto para calcular la superficie.
    double getArea(); 
    
    // Método abstracto para calcular el contorno de la figura.
    double getPerimeter(); 
}
