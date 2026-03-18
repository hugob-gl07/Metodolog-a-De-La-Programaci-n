package Ejercicios.Resizable_Y_GeometricObject;

// Esta clase representa un círculo genérico que cumple con el contrato 'GeometricObject'.
// Al implementar una interfaz, la clase se compromete a proporcionar la lógica real
// para los métodos de cálculo de perímetro y área.
public class Circle implements GeometricObject {
    
    // Atributo protegido para permitir que clases hijas (como ResizableCircle)
    // puedan acceder al radio directamente sin necesidad de métodos intermedios.
    protected double radius;

    // --- CONSTRUCTOR ---

    // Constructor que define el estado inicial del círculo.
    // Recibe el radio necesario para realizar todos los cálculos posteriores.
    public Circle(double radius) {
        this.radius = radius;
    }

    // --- MÉTODOS DE LA INTERFAZ (IMPLEMENTACIÓN) ---

    // Implementación del método definido en GeometricObject.
    // Calcula la longitud de la circunferencia utilizando la constante Math.PI.
    //Devuelve el perímetro en forma del tipo básico double (propio en estos métodos matematicos)
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Implementación del método definido en GeometricObject.
    // Calcula la superficie del círculo siguiendo la fórmula matemática: pi * r².
    //Devuelve el área en forma del tipo básico double (propio en estos métodos matematicos).
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // --- REPRESENTACIÓN VISUAL ---

    // Devuelve una cadena de texto con el estado interno del objeto.
    // Es fundamental para tareas de depuración y para mostrar los datos por consola.
    //Devuelve por pantalla en forma del tipo básico string
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
