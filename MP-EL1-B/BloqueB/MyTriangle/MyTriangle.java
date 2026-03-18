package BloqueB.MyTriangle;

import BloqueB.Arrays.MyPoint;

/**
 * Representa un triángulo en el plano cartesiano definido por tres vértices MyPoint.
 */
public class MyTriangle {  /** Definimos la clase MyTriangle usando tres puntos MyPoint como vértices. */

private MyPoint v1;  // Primer vértice del triángulo
    private MyPoint v2;  // Segundo vértice del triángulo
    private MyPoint v3;  // Tercer vértice del triángulo

    /** Constructor con coordenadas de los tres vértices (x1,y1), (x2,y2), (x3,y3). */
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);  // Creamos primer vértice con coordenadas dadas
        this.v2 = new MyPoint(x2, y2);  // Creamos segundo vértice con coordenadas dadas
        this.v3 = new MyPoint(x3, y3);  // Creamos tercer vértice con coordenadas dadas
    }

    /** Constructor con objetos MyPoint ya existentes para los tres vértices. */
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;  // Guardamos el primer vértice proporcionado
        this.v2 = v2;  // Guardamos el segundo vértice proporcionado
        this.v3 = v3;  // Guardamos el tercer vértice proporcionado
    }

    /** Devuelve una representación en texto del triángulo. */
    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";  // Concatenamos los tres vértices formateados
    }

    /** Devuelve el perímetro del triángulo (suma de los tres lados). */
    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);  // Sumamos distancias entre todos los pares de vértices
    }

    /** Devuelve el tipo de triángulo según la igualdad de sus lados. */
    public String getType() {
        double d1 = v1.distance(v2);  // Longitud del lado v1-v2
        double d2 = v2.distance(v3);  // Longitud del lado v2-v3
        double d3 = v3.distance(v1);  // Longitud del lado v3-v1

        if (d1 == d2 && d2 == d3) {  // Todos los lados iguales
            return "Equilateral";    // Triángulo equilátero
        } else if (d1 == d2 || d1 == d3 || d2 == d3) {  // Dos lados iguales
            return "Isosceles";      // Triángulo isósceles
        } else {  // Todos los lados diferentes
            return "Scalene";        // Triángulo escaleno
        }
    }
}
