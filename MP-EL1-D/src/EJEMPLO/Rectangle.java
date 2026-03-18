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
// Implementación del método abstracto getArea.
    // Para un rectángulo, el área se define como el producto de sus dos dimensiones.
    // Este método sobrescribe la definición abstracta para aplicar la fórmula: base * altura.
    // Como resultado obtenemos el área del rectangulo en formato del tipo básico de datos double.
    @Override
    public double getArea() { return width * length; }
// Implementación del método abstracto getPerimeter.
    // Se calcula sumando los cuatro lados de la figura. Matemáticamente optimizado
    // como el doble de la suma de la base y la altura: 2 * (ancho + largo).
    // Obtenemos el perimetro en forma del tipo básico de datos double
    @Override
    public double getPerimeter() { return 2 * (width + length); }
// Sobrescribe el método toString para generar una cadena de texto descriptiva.
    // Lo más importante aquí es el uso de super.toString(), que permite incluir la 
    // información de color y relleno definida en la clase padre sin tener que 
    // volver a escribir esa lógica aquí. Es un ejemplo de polimorfismo y herencia.
    @Override
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}
