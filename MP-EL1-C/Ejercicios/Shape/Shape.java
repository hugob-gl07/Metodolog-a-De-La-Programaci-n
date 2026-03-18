package Ejercicios.Shape;
/**
 * Representa una figura geométrica con color y relleno.
 */
public class Shape {
    private String color="red";
    private boolean filled=true;
    /** Constructor por defecto.*/
    public Shape(){}
    /** Constructor con color y relleno dados.*/
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    /** Devuelve el color de la figura.*/
    public String getColor() {
        return color;
    }

    /** Modifica el color de la figura.*/
    public void setColor(String color) {
        this.color = color;
    }
    /** Modifica el relleno de la figura.*/
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    /** Devuelve si la figura está rellena.*/
    public boolean isFilled(){
        return filled;
    }
    /** Devuelve una representación en texto de la figura.*/
    @Override
    public String toString() {
        return "Shape[color= " + color + ", filled= " + filled + "]";
    }
}