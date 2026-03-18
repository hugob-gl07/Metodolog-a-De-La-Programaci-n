package src.Ejercicios.Point2;
/**
 * Representa un punto en el plano con coordenadas x e y.
 */
public class Point {
    private int x;
    public int y;
    /** Constructor con coordenadas x e y. */
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    /** Devuelve la coordenada x del punto.*/
    public int getX() {
        return x;
    }
    /** Modifica la coordenada x del punto.*/
    public void setX(int x) {
        this.x = x;
    }
    /** Devuelve la coordenada y del punto.*/
    public int getY() {
        return y;
    }
    /** Modifica la coordenada y del punto.*/
    public void setY(int y) {
        this.y = y;
    }
    /** Modifica las coordenadas x e y del punto a la vez.*/
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    /** Devuelve una representación en texto del punto.*/
    public String toString(){
        return "Point: ("+ this.x + "," + this.y + ")";
    }
}