package src.Ejercicios.Shape;
/**
 * Probador para las clases Shape, Circle y Rectangle
 */
public class TestShape {
    public static void main(String[] args){
        /** Declara e instancia s1 con el constructor de Shape.*/
        Shape s1=new Shape("blue", false);
        /** Imprime s1 usando toString() */
        System.out.println(s1);
        /** Declara e instancia c1 con el constructor de Circle.*/
        Circle c1= new Circle(5.5,"blue", false);
        /** Imprime c1 usando toString() */
        System.out.println(c1);
        /** Imprime el área y perímetro de c1 */
        System.out.println("Area del circulo: "+ c1.getArea());
        System.out.println("Perimetro del circulo: "+ c1.getPerimeter());

        /** Declara e instancia r1 con el constructor de Rectangle.*/
        Rectangle r1= new Rectangle(2.0f,4.0f,"green",true);
        /** Imprime r1 usando toString() */
        System.out.println(r1);
        /** Imprime el área y perímetro de r1 */
        System.out.println("Area del Rectangulo: "+ r1.getArea());
        System.out.println("Perimetro del circulo: "+ r1.getPerimeter());
        /** Modifica la longitud, anchura y color de r1 */
        r1.setLength(6.0f);
        r1.setWidth(6.0f);
        r1.setColor("yellow");
        /** Imprime r1 con los nuevos valores */
        System.out.println(r1);
        /** Imprime el área de r1 tras los cambios */
        System.out.println("Area del Rectangulo: "+ r1.getArea());
    }
}