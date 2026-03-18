package BloqueB.Arrays;

/**
 * Representa un punto en el plano cartesiano con coordenadas x e y.
 */
public class MyPoint {  /** Creamos la clase MyPoint e indicamos las variables que vamos a usar. */

private int x = 0;  // Coordenada x del punto, inicializada a 0 por defecto
    private int y = 0;  // Coordenada y del punto, inicializada a 0 por defecto

    /** Constructor por defecto que crea un punto en el origen (0,0). */
    public MyPoint() {
    }

    /** Constructor que inicializa el punto con las coordenadas dadas (x, y). */
    public MyPoint(int x, int y) {  /** definimos las variables */
        this.x = x;  // Asignamos el valor pasado por parámetro a la coordenada x
        this.y = y;  // Asignamos el valor pasado por parámetro a la coordenada y
    }

    /** Usamos getters y setters para acceder a los datos y poder modificarlos. */
    public int getX() { return x; }  // Devuelve el valor actual de x
    public void setX(int x) { this.x = x; }  // Modifica el valor de x
    public int getY() { return y; }  // Devuelve el valor actual de y
    public void setY(int y) { this.y = y; }  // Modifica el valor de y

    /** Devuelve un array de enteros que contiene las coordenadas x e y. */
    public int[] getXY() {
        return new int[] {this.x, this.y};  // Creamos y retornamos el array con ambas coordenadas
    }

    /** Modifica ambas coordenadas x e y al mismo tiempo. */
    public void setXY(int x, int y) {
        this.x = x;  // Actualizamos la coordenada x
        this.y = y;  // Actualizamos la coordenada y
    }

    /** Calculamos la distancia entre este punto y unas coordenadas x e y dadas. */
    public double distance(int x, int y) {
        int xDiff = this.x - x;  // Calculamos la diferencia de distancias en el eje x
        int yDiff = this.y - y;  // Calculamos la diferencia de distancias en el eje y
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);  // Aplicamos el teorema de Pitágoras
    }

    /** Calculamos la distancia entre este punto y otro objeto MyPoint dado. */
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;  // Diferencia en x usando las coordenadas del otro punto
        int yDiff = this.y - another.y;  // Diferencia en y usando las coordenadas del otro punto
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);  // Aplicamos el teorema de Pitágoras
    }

    /** Calculamos la distancia desde este punto hasta el origen de coordenadas (0,0). */
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);  // Distancia directa usando sus propias coordenadas
    }

    /** Devuelve una representación en texto del punto. */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";  // Formateamos la salida geométrica clásica (x,y)
    }
}