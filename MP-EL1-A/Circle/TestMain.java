package Circle;
/**
 * Segundo probador para la clase Circle
 */

public class TestMain {
    public static void main(String[] args) {
        /** Declara e instancia c1 con el segundo constructor. */
        Circle c1 = new Circle(1.1);
        /** Imprime c1 usando toString()*/
        System.out.println(c1);
        /** Declara e instancia c2 con el constructor por defecto. */
        Circle c2 = new Circle();
        /** Imprime c2 usando toString()*/
        System.out.println(c2);
        /** Modifica el radio de c1 */
        c1.setRadius(2.2);
        /** Imprime c1 usando toString()*/
        System.out.println(c1);
        /** Imprime el radio de c1 */
        System.out.println("radius is: " + c1.getRadius());
        /** Imprime el area y la circuferencia de c1 usando dos decimales*/
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());

    }
}