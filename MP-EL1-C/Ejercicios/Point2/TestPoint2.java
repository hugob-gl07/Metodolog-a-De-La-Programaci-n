package Ejercicios.Point2;
/**
 * Probador para las clases Point y LineSub
 */
public class TestPoint2 {
    public static void main(String[] args) {
        /** Declara e instancia p1 con el constructor de Point.*/
        Point p1=new Point(1,2);
        // Imprime p1 usando toString()
        System.out.println(p1);
        /** Declara e instancia ls1 con el constructor de LineSub usando instancias anónimas de Point.*/
        LineSub ls1= new LineSub(new Point(0,0), new Point(3,4));
        /** Imprime ls1 usando toString() */
        System.out.println(ls1);
        /** Imprime la longitud de ls1 */
        System.out.println("La longitud es: "+ ls1.getLength());
        /** Declara e instancia ls2 con el constructor de LineSub usando instancias anónimas de Point.*/
        LineSub ls2= new LineSub(new Point(1,2), new Point(4,5));
        /** Imprime ls2 usando toString() */
        System.out.println(ls2);
        /** Imprime el ángulo de inclinación de ls2 */
        System.out.println("El gradiente es: "+ ls2.getGradient());
        /** Modifica las coordenadas de inicio y fin de ls1 a la vez */
        ls1.setBeginXY(10,10);
        ls1.setEndXY(20,20);
        /** Imprime ls1 con las nuevas coordenadas */
        System.out.println(ls1);
        /** Imprime la coordenada x del punto de inicio de ls1 */
        System.out.println("Punto de inicio es : "+ ls1.getBeginX());
    }
}