package Ejercicios.Circle;

import Ejercicios.Circle.Circle;

/**
 * Probador para la clase Circle
 */
public class TestCircle {
    public static void main(String[] args) {
    /** Declara e instancia c1 con el constructor con radio.*/
        Circle c1= new Circle(1.1);
    /** Imprime c1 usando toString() */
        System.out.println(c1);
    /** Declara e instancia c2 con el constructor con radio.*/
        Circle c2=new Circle();
    /** Imprime c2 usando toString() */
        System.out.println(c2);
    /** Modifica el radio de c1 a 2.2 */
        c1.setRadius(2.2);
    /** Imprimir c1 con el nuevo radio */
        System.out.println(c1);
    /** Imprime el radio, área y circunferencia de c1 */
        System.out.println("radius is: "+ c1.getRadius());
        System.out.println("area is: "+ c1.getArea());
        System.out.println("circumference is: "+ c1.getCircumference());

    }

}
