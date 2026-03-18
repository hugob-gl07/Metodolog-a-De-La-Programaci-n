package BloqueB.MyLinePackage;

/**
 * Representa una línea en el plano cartesiano definida por dos puntos (inicio y fin).
 */
public class MyLine {  /** Definimos la clase MyLine usando objetos MyPoint para sus extremos. */

private MyPoint begin;  // Punto inicial de la línea
    private MyPoint end;    // Punto final de la línea

    /** Constructor con coordenadas de inicio (x1,y1) y fin (x2,y2). */
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);  // Creamos el punto inicial con coordenadas dadas
        this.end = new MyPoint(x2, y2);    // Creamos el punto final con coordenadas dadas
    }

    /** Constructor con objetos MyPoint ya existentes para inicio y fin. */
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;  // Guardamos el punto inicial proporcionado
        this.end = end;      // Guardamos el punto final proporcionado
    }

    /** Devuelve el punto inicial de la línea. */
    public MyPoint getBegin() {
        return begin;  // Devolvemos el punto inicial
    }

    /** Modifica el punto inicial de la línea. */
    public void setBegin(MyPoint begin) {
        this.begin = begin;  // Actualizamos el punto inicial
    }

    /** Devuelve el punto final de la línea. */
    public MyPoint getEnd() {
        return end;  // Devolvemos el punto final
    }

    /** Modifica el punto final de la línea. */
    public void setEnd(MyPoint end) {
        this.end = end;  // Actualizamos el punto final
    }

    /** Devuelve la coordenada X del punto inicial. */
    public int getBeginX() {
        return begin.getX();  // Obtenemos X del punto inicial
    }

    /** Modifica la coordenada X del punto inicial. */
    public void setBeginX(int x) {
        begin.setX(x);  // Actualizamos X del punto inicial
    }

    /** Devuelve la coordenada Y del punto inicial. */
    public int getBeginY() {
        return begin.getY();  // Obtenemos Y del punto inicial
    }

    /** Modifica la coordenada Y del punto inicial. */
    public void setBeginY(int y) {
        begin.setY(y);  // Actualizamos Y del punto inicial
    }

    /** Devuelve la coordenada X del punto final. */
    public int getEndX() {
        return end.getX();  // Obtenemos X del punto final
    }

    /** Modifica la coordenada X del punto final. */
    public void setEndX(int x) {
        end.setX(x);  // Actualizamos X del punto final
    }

    /** Devuelve la coordenada Y del punto final. */
    public int getEndY() {
        return end.getY();  // Obtenemos Y del punto final
    }

    /** Modifica la coordenada Y del punto final. */
    public void setEndY(int y) {
        end.setY(y);  // Actualizamos Y del punto final
    }

    /** Devuelve las coordenadas X,Y del punto inicial como array. */
    public int[] getBeginXY() {
        return begin.getXY();  // Obtenemos array XY del punto inicial
    }

    /** Modifica las coordenadas X,Y del punto inicial. */
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);  // Actualizamos ambas coordenadas del punto inicial
    }

    /** Devuelve las coordenadas X,Y del punto final como array. */
    public int[] getEndXY() {
        return end.getXY();  // Obtenemos array XY del punto final
    }

    /** Modifica las coordenadas X,Y del punto final. */
    public void setEndXY(int x, int y) {
        end.setXY(x, y);  // Actualizamos ambas coordenadas del punto final
    }

    /** Devuelve la longitud de la línea (distancia entre puntos). */
    public double getLength() {
        return begin.distance(end);  // Calculamos distancia entre inicio y fin usando MyPoint
    }

    /** Devuelve el ángulo de inclinación de la línea (en radianes). */
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();  // Diferencia horizontal (Δx)
        int yDiff = end.getY() - begin.getY();  // Diferencia vertical (Δy)
        return Math.atan2(yDiff, xDiff);  // Calculamos arcotangente para obtener el ángulo respecto al eje X
    }

    /** Devuelve una representación en texto de la línea. */
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ",end=" + end + "]";  // Concatenamos puntos inicial y final formateados
    }
}
