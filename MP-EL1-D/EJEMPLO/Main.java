package EJEMPLO;

public class Main {  // save as "TestCylinder.java"
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // versión del circulo
        System.out.println(s1.getArea());          // versión del circulo
        System.out.println(s1.getPerimeter());     // versión del circulo
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius()); ERROR: Este metodo no está implementado en Shape.

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); ERROR: No se puede crear una instancia de una clase abstracta.

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea()); //version del rectangulo
        System.out.println(s3.getPerimeter()); //version del rectangulo
        System.out.println(s3.getColor()); //viene de Shape
        //System.out.println(s3.getLength()); ERROR: Este metodo no está implementado en Shape.

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea()); //versión del rectangulo
        System.out.println(r1.getColor()); //versión del rectangulo
        System.out.println(r1.getLength()); //versión del rectangulo

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea()); // versión del cuadrado
        System.out.println(s4.getColor());// viene de Shape
        //System.out.println(s4.getSide()); ERROR:No es reconocido por shape

// Take note that we downcast Shape s4 to Rectangle,
//  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());//versión del rectangulo
        System.out.println(r2.getColor()); //viene de Shape
        // System.out.println(r2.getSide()); ERROR: Este metodo es del cuadrado, no del rectangulo
        System.out.println(r2.getLength());// metodo del rectangulo.
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea()); //viene del rectangulo
        System.out.println(sq1.getColor());//viene de Shape
        System.out.println(sq1.getSide()); // metodo del rectangulo
        System.out.println(sq1.getLength()); //metodo del rectangulo
    }
}
//CLASE ABSTRACTA: Es una plantilla, una clase que no puede ser instaciada por si misma, que
//                 permite definir una base comun (atributos y metodos compartidos), que luego al
//                 establecer una jerarquia de clases, seran heredados por las clases hijas.

//METODOS ABSTRACTOS: Obligan a las subclases concretas a proporcionar su propia
//                    implementación específica, segun lo que se haya declarado en la
//                    clase abstracta