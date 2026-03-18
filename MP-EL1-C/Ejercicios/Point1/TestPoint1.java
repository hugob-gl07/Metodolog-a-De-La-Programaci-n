package Ejercicios.Point1;
/**
 * Probador para las clases Point y Line
 */
public class TestPoint1 {
    public static void main(String[] args) {
        /** Declara e instancia p1 con el constructor de Point.*/
        Point p1=new Point(10,20);
        /** Imprime p1 usando toString() */
        System.out.println(p1);
        /** Declara e instancia l1 con el constructor de Line usando instancias anónimas de Point.*/
        Line l1=new Line(new Point(0,0),new Point(3,4));
        /** Imprime l1 usando toString()*/
        System.out.println(l1);
        /** Imprime la longitud y el ángulo de inclinación de l1 */
        System.out.println("La longitud es: " + l1.getLength());
        System.out.println("EL gradiente es: "+ l1.getGradient());
        /** Modifica las coordenadas de inicio de l1 a la vez */
        l1.setBeginXY(1,2);
        /** Imprime l1 con las nuevas coordenadas de inicio */
        System.out.println(l1);
    }
}