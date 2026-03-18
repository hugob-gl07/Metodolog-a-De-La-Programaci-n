package src.Ejercicios.Shape;
/**
 * Representa un rectángulo como subclase de Shape, añadiendo anchura y longitud.
 */
public class Rectangle extends Shape {
    private double width=0.0f;
    private double length=0.0f;
    /** Constructor por defecto.*/
    public Rectangle(){}
    /** Constructor con anchura y longitud dadas.*/
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    /** Constructor con anchura, longitud, color y relleno dados.*/
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    /** Devuelve la anchura del rectángulo.*/
    public double getWidth() {
        return width;
    }
    /** Modifica la anchura del rectángulo.*/
    public void setWidth(double width) {
        this.width = width;
    }
    /** Devuelve la longitud del rectángulo.*/
    public double getLength() {
        return length;
    }
    /** Modifica la longitud del rectángulo.*/
    public void setLength(double length) {
        this.length = length;
    }
    /** Calcula y devuelve el área del rectángulo.*/
    public double getArea(){
        return width*length;
    }
    /** Calcula y devuelve el perímetro del rectángulo.*/
    public double getPerimeter(){
        return (2*width)+(2*length);
    }
    /** Devuelve una representación en texto del rectángulo.*/
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width= " + width + ",length= " + length + "]";
    }
}