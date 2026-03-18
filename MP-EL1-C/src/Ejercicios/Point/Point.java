package src.Ejercicios.Point;
/**
 * Representa un punto en el plano con coordenadas x e y.
 */
public class Point {
    private float x=0.0f;
    private float y=0.0f;
    /** Constructor con coordenadas x e y.*/
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    /** Constructor por defecto.*/
    public Point(){
    }
    /** Devuelve la coordenada y del punto.*/
    public float getY() {
        return y;
    }
    /** Modifica la coordenada y del punto.*/
    public void setY(float y) {
        this.y = y;
    }
    /** Devuelve la coordenada x del punto.*/
    public float getX() {
        return x;
    }
    /** Modifica la coordenada x del punto.*/
    public void setX(float x) {
        this.x = x;
    }
    /** Modifica las coordenadas x e y del punto a la vez.*/
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    /** Devuelve las coordenadas x e y del punto como array.*/
    public float[] getXY(){
        float[] punto= new float[2];
        punto[0]= this.x;
        punto[1]=this.y;
        return punto;
    }
    /** Devuelve una representación en texto del punto.*/
    @Override
    public String toString() {
        return "(" + this.x +","+ this.y + ")";
    }
}