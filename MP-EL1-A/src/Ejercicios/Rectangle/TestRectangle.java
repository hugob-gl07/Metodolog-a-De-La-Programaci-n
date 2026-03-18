package src.Ejercicios.Rectangle;
/**
 * Probador para la clase Rectangle
 */
public class TestRectangle {
    public static void main(String[] args) {
    /**
     * Declara e instancia r1 con el constructor completo.
     * Nota: se usa 'f' para indicar que el valor es float
     */
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
    /** Imprime r1 usando toString() */
        System.out.println(r1);
    /** Declara e instancia r1 con el constructor completo */
        Rectangle r2 = new Rectangle();
    /** Imprime r2 usando toString() */
        System.out.println(r2);
    /** Modifica la longitud y anchura de r1 */
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
    /** Imprime r1 con los nuevos valores */
        System.out.println(r1);
    /** Imprime la longitud y anchura de r1 */
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());
    /**Imprime la longitud y anchura de r1 con 2 decimales */
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }

}
