package Ejercicios.Rectangle;
/**
 * Representa un rectángulo con longitud y anchura.
 */
public class Rectangle {
    private float length;
    private float width;
/** Constructor por defecto. */
    public Rectangle(){
        length=1.0f;
        width=1.0f;
    }
/** Constructor con longitud y anchura dadas. */
    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }
/** Modifica la longitud del rectángulo. */
    public void setLength(float length){
         this.length=length;
    }
/** Devuelve la longitud del rectángulo. */
    public float getLength(){
        return length;
    }
/** Calcula y devuelve el área del rectángulo. */
    public double getArea(){

        return (double)length*width;
    }
/** Calcula y devuelve el perímetro del rectángulo. */
    public double getPerimeter(){
        return (2*length+2*width);
    }
/** Modifica la anchura del rectángulo */
    public void setWidth(float width){
        this.width=width;
    }
/** Devuelve la anchura del rectángulo. */
    public float getWidth(){
        return width;
    }
/** Devuelve una representación en texto del rectángulo. */
    public String toString(){
        return "Rectangle.Rectangle[length="+ length +",width="+ width +"]";
    }
}
