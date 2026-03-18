package BloqueB.MyPointTestPackage;

/**
 * Representa un punto en el plano cartesiano con coordenadas X e Y.
 */
public class MyPoint {  /** Definimos la clase MyPoint con coordenadas del plano cartesiano. */

private int x = 0;  // Coordenada X del punto (inicialmente 0)
    private int y = 0;  // Coordenada Y del punto (inicialmente 0)

    /** Constructor por defecto (punto en origen 0,0). */
    public MyPoint() {
        // Valores por defecto ya asignados en declaración de atributos
    }

    /** Constructor con coordenadas X e Y específicas. */
    public MyPoint(int x, int y) {
        this.x = x;  // Guardamos la coordenada X del punto
        this.y = y;  // Guardamos la coordenada Y del punto
    }

    /** Devuelve la coordenada X del punto. */
    public int getX() {
        return x;  // Devolvemos la coordenada X
    }

    /** Modifica la coordenada X del punto. */
    public void setX(int x) {
        this.x = x;  // Actualizamos la coordenada X
    }

    /** Devuelve la coordenada Y del punto. */
    public int getY() {
        return y;  // Devolvemos la coordenada Y
    }

    /** Modifica la coordenada Y del punto. */
    public void setY(int y) {
        this.y = y;  // Actualizamos la coordenada Y
    }

    /** Devuelve las coordenadas X e Y como array. */
    public int[] getXY() {
        return new int[]{this.x, this.y};  // Creamos y devolvemos array con ambas coordenadas
    }

    /** Modifica ambas coordenadas X e Y del punto. */
    public void setXY(int x, int y) {
        this.x = x;  // Actualizamos la coordenada X
        this.y = y;  // Actualizamos la coordenada Y
    }

    /** Calcula la distancia euclidiana desde este punto a coordenadas (x,y). */
    public double distance(int x, int y) {
        int xDiff = this.x - x;  // Diferencia en coordenada X
        int yDiff = this.y - y;  // Diferencia en coordenada Y
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);  // Aplicamos fórmula de distancia euclidiana
    }

    /** Calcula la distancia euclidiana entre este punto y otro punto MyPoint. */
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;  // Diferencia en coordenada X
        int yDiff = this.y - another.y;  // Diferencia en coordenada Y
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);  // Aplicamos fórmula de distancia euclidiana
    }

    /** Calcula la distancia desde este punto hasta el origen (0,0). */
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);  // Distancia al origen usando Teorema de Pitágoras
    }

    /** Devuelve una representación en texto del punto. */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";  // Formato estándar de coordenadas (x,y)
    }
}
