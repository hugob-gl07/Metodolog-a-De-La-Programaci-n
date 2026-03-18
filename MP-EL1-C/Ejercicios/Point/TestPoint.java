package Ejercicios.Point;
/**
 * Probador para las clases Point y MovablePoint
 */
public class TestPoint {
    public static void main(String[] args){
        /** Declara e instancia p1 con el constructor de Point. */
        Point p1=new Point(10.0f,20.0f);
        /** Imprime p1 usando toString() */
        System.out.println("Punto inicial: "+p1);

        /** Modifica las coordenadas de p1 a la vez */
        p1.setXY(15.5f,25.5f);
        /** Imprime p1 con las nuevas coordenadas */
        System.out.println("Punto modificado: "+ p1);

        /** Declara e instancia m1 con el constructor de MovablePoint.*/
        MovablePoint m1=new MovablePoint(1.0f,2.0f, 0.5f,0.5f);
        /** Imprime m1 antes de moverse */
        System.out.println("MovablePoint antes de moverse:" + m1);
        /** Modifica la posición de m1 al primer movimiento */
        m1.setXY(1.5f,2.5f);
        /** Imprime m1 tras el primer movimiento */
        System.out.println("MovablePoint 1er movimiento:" + m1);
        /** Modifica la posición de m1 al segundo movimiento */
        m1.setXY(2.0f,3.0f);
        /** Imprime m1 tras el segundo movimiento */
        System.out.println("MovablePoint 2nd de mocerse:" + m1);
        /** Modifica la posición y la velocidad de m1 */
        m1.setXY(4.0f,6.0f);
        m1.setXSpeed(2.0f);
        m1.setYSpeed(3.0f);
        /** Imprime m1 con la nueva posición y velocidad */
        System.out.println("MovablePoint con movimiento y nueva velocidad: " + m1);
    }
}