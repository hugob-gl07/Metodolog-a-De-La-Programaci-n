package Ejercicios.Resizable_Y_GeometricObject;

// La clase ResizableCircle combina la herencia de Circle con la implementación 
// de la interfaz Resizable. Esto permite que un círculo no solo tenga propiedades 
// geométricas, sino también la capacidad de alterar su tamaño dinámicamente.
public class ResizableCircle extends Circle implements Resizable {

    // --- CONSTRUCTOR ---

    // Constructor que inicializa el círculo con un radio específico.
    // Utiliza super(radius) para invocar al constructor de la clase Circle,
    // garantizando que el atributo 'radius' se herede y configure correctamente.
    public ResizableCircle(double radius) {
        super(radius);
    }

    // --- MÉTODOS DE COMPORTAMIENTO (INTERFACE) ---

    // Implementación del método resize definido en la interfaz Resizable.
    // Este método aplica un factor de escala al radio actual.
    // Al dividir 'percent' entre 100.0, convertimos el entero en un factor decimal 
    // (ej: 110% se convierte en 1.1), permitiendo que el radio crezca o disminuya.
    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }

    // --- REPRESENTACIÓN VISUAL ---

    // Sobrescribe el método toString para identificar al objeto como redimensionable.
    // Al llamar a super.toString(), se incluye toda la cadena generada por Circle 
    // (que a su vez incluye la de Shape), demostrando una trazabilidad total 
    // a través de la cadena de herencia.
    //Devuelve por pantalla el tipo básico string.
    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
}
