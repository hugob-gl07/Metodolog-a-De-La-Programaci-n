package Circle;
/**
 * Probador para la clase Circle.Circle
 */
public class TestCircle {
    public static void main(String[] args){
        /** Declara e instancia c1 con el constructor por defecto*/
        Circle c1=new Circle();
        /**Imprime el radio,área y color de c1*/
        System.out.println("The circle has radius of " + c1.getRadius()+ " and area of "+c1.getArea()+ " and color of "+c1.getColor());
        /** Declara e instancia c2 con el seguundo constructor*/
        Circle c2=new Circle(2.0);
        /**Imprime el radio,área y color de c2*/
        System.out.println("The circle has radius of " + c2.getRadius()+ " and area of" +c2.getArea()+" and color of "+c2.getColor());
        /** Declara e instancia c3 con el tercer constructor*/
        Circle c3=new Circle(5.0, "yellow");
        /**Imprime el radio,área y color de c3*/
        System.out.println("The circle has radius of " + c3.getRadius()+ " and area of " +c3.getArea()+" and color of "+c3.getColor());
        /** Declara e instancia c3 con el constructor por defecto*/
        Circle c4=new Circle();
        /** Modifica el radio */
        c4.setRadius(5.5);
        /**Imprime el nuevo radio de c4*/
        System.out.println("Radius is: "+ c4.getRadius());
        /** Modifica el color */
        c4.setColor("green");
        /** Imprime el nuevo color de c4*/
        System.out.println("Color is: "+ c4.getColor());
        /** Modifica el radio */
        c4.setRadius(4.4);
        /**Imprime el nuevo radio de c4*/
        System.out.println(c4.getRadius());
    }
}