package Circle1;
/**
 * Probador para la clase Cylinder
 */
public class TestCylinder {
    public static void main(String[] args){
        /** Declara e instancia c1 con el constructor por defecto.*/
        Cylinder c1=new Cylinder();
        /** Imprime el radio, altura, área de la base y volumen de c1 */
        System.out.println("Circle.Cylinder: " + " radius= "+ c1.getRadius() + " height= " + c1.getHeight() +
                " base area= " +c1.getArea() + " volume= " + c1.getVolume());
        /** Declara e instancia c2 con el constructor con radio.*/
        Cylinder c2=new Cylinder(10.0);
        /** Imprime el radio, altura, área de la base y volumen de c2 */
        System.out.println("Circle.Cylinder: " + " radius= "+ c2.getRadius() + " height= " + c2.getHeight() +
                " base area= " + c2.getArea() + " volume= " + c2.getVolume());
        /** Declara e instancia c3 con el constructor con radio y altura.*/
        Cylinder c3=new Cylinder(2.0,10.0);
        /** Imprime el radio, altura, área de la base y volumen de c3 */
        System.out.println("Circle.Cylinder: " + " radius= "+ c3.getRadius() + " height= " + c3.getHeight() +
                " base area= " + c3.getArea() + " volume= " + c3.getVolume());
    }
}