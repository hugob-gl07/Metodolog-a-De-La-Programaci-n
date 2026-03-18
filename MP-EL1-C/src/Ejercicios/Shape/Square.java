package src.Ejercicios.Shape;
/**
 * Representa un cuadrado como subclase de Rectangle,
 * donde anchura y longitud son siempre iguales.
 */
public class Square extends Rectangle {
    /** Constructor por defecto.*/
    public Square(){}
    /** Constructor con lado dado.*/
    public Square(double side){
        super(side,side);
    }
    /** Constructor con lado, color y relleno dados.*/
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    /** Devuelve el lado del cuadrado.*/
    public double getSide(){
        return super.getWidth();
    }
    /** Modifica el lado del cuadrado actualizando anchura y longitud a la vez. */
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    /** Modifica la anchura del cuadrado actualizando también la longitud para mantener el cuadrado consistente.*/
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
    /** Modifica la longitud del cuadrado actualizando también la anchura para mantener el cuadrado consistente.*/
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
    /** Devuelve una representación en texto del cuadrado.*/
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}