package BloqueB.MyCirclePackage;

/**
 * Clase principal para probar la funcionalidad de MyCircle y MyPoint.
 */
public class TestMyCircle {  /** Definimos la clase de pruebas principal para círculos. */

public static void main(String[] args) {  /** Método principal que ejecuta todas las pruebas. */

    MyCircle c1 = new MyCircle(new MyPoint(), 1);  // Creamos primer círculo con centro en origen (0,0) y radio 1
    System.out.println(c1);  // Mostramos la información completa del primer círculo
    System.out.printf("Area: %.2f%n", c1.getArea());  // Mostramos el área formateada con 2 decimales
    System.out.printf("Circumference: %.2f%n", c1.getCircumference());  // Mostramos la circunferencia formateada con 2 decimales

    MyCircle c2 = new MyCircle(new MyPoint(4, 5), 2);  // Creamos segundo círculo con centro (4,5) y radio 2
    System.out.println("Distance between circles: " + c1.distance(c2));  // Calculamos y mostramos la distancia entre centros de ambos círculos
}
}
