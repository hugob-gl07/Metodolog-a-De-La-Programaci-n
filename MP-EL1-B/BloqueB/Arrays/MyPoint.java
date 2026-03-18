package BloqueB.Arrays;

/**
 * Representa un punto en el plano con coordenadas x e y.
 * Usada por la clase Matriz para calcular distancias entre puntos.
 */
public class MyPoint {

    private int x = 0; // Coordenada x del punto
    private int y = 0; // Coordenada y del punto

    /** Constructor por defecto. Coordenadas: (0,0)*/
    public MyPoint() {}

    /** Constructor con coordenadas x e y.*/
    public MyPoint(int x, int y) {
        this.x = x; // Guardamos la coordenada x
        this.y = y; // Guardamos la coordenada y
    }

    /** Devuelve la coordenada x del punto.*/
    public int getX() { return x; }

    /** Modifica la coordenada x del punto.*/
    public void setX(int x) { this.x = x; }

    /** Devuelve la coordenada y del punto.*/
    public int getY() { return y; }

    /** Modifica la coordenada y del punto.*/
    public void setY(int y) { this.y = y; }

    /**
     * Calcula y devuelve la distancia entre este punto y otro.
     * Usa el teorema de Pitágoras: sqrt((x2-x1)² + (y2-y1)²)
     */
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x; // Diferencia entre las coordenadas x
        int yDiff = this.y - another.y; // Diferencia entre las coordenadas y
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff); // Aplicamos el teorema de Pitágoras
    }

    /** Devuelve una representación en texto del punto.*/
    @Override
    public String toString() {
        return "(" + x + "," + y + ")"; // Devolvemos el punto en formato (x,y)
    }
}