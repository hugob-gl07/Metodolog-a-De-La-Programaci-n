package BloqueB.MyPointTestPackage;

/**
 * Clase principal para probar exhaustivamente la funcionalidad de MyPoint.
 */
public class TestMyPoint {  /** Definimos la clase de pruebas completa para MyPoint. */

public static void main(String[] args) {  /** Método principal que ejecuta todas las pruebas. */

    // 1️⃣ Test constructor por defecto (origen)
    MyPoint p1 = new MyPoint();  // Punto en (0,0) por defecto
    System.out.println("1. Punto por defecto: " + p1);  // Mostramos (0,0)
    System.out.printf("   Distancia al origen: %.2f%n", p1.distance());  // Debe ser 0.00

    // 2️⃣ Test constructor con coordenadas
    MyPoint p2 = new MyPoint(3, 4);  // Punto en (3,4)
    System.out.println("\n2. Punto (3,4): " + p2);  // Mostramos (3,4)
    System.out.println("   getX(): " + p2.getX() + ", getY(): " + p2.getY());  // Verificamos coordenadas individuales
    System.out.printf("   getXY(): [%d, %d]%n", p2.getXY()[0], p2.getXY()[1]);  // Verificamos array coordenadas

    // 3️⃣ Test setters individuales
    p2.setX(5);   // Cambiamos X a 5
    p2.setY(12);  // Cambiamos Y a 12
    System.out.println("\n3. Tras setters: " + p2);  // Mostramos (5,12)

    // 4️⃣ Test setter combinado
    p2.setXY(8, 15);  // Cambiamos ambas coordenadas
    System.out.println("   Tras setXY(8,15): " + p2);  // Mostramos (8,15)

    // 5️⃣ Test distancias
    System.out.printf("\n4. Distancias:%n");
    System.out.printf("   Distancia a (0,0): %.2f%n", p2.distance());  // Distancia al origen
    System.out.printf("   Distancia a (3,4): %.2f%n", p2.distance(3, 4));  // Distancia a coordenadas
    MyPoint p3 = new MyPoint(-2, 7);  // Nuevo punto para comparar
    System.out.printf("   Distancia a p3(-2,7): %.2f%n", p2.distance(p3));  // Distancia entre objetos

    // 6️⃣ Test más distancias
    System.out.printf("   p3 distancia al origen: %.2f%n", p3.distance());

    // 7️⃣ Verificación pitagórica (3,4,5)
    MyPoint p4 = new MyPoint(0, 0);
    MyPoint p5 = new MyPoint(3, 4);
    System.out.printf("\n5. Verificación Pitágoras (0,0)-(3,4): %.2f (debe ser 5)%n", p4.distance(p5));
}
}
