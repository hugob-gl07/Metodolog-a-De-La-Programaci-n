package Ejercicios.Points;
/**
 * Probador para las clases Point2D y Point3D
 */
public class TestPoints {
    public static void main(String[] args){
        /** Declara e instancia p1 con el constructor de Point2D.*/
        Point2D p1= new Point2D(1.5f,2.5f);
        /** Imprime p1 usando toString() */
        System.out.println("Punto orignal: "+p1);
        /** Modifica las coordenadas de p1 a la vez */
        p1.setXY(3.0f,4.0f);
        /** Imprime p1 con las nuevas coordenadas */
        System.out.println("Punto modificado"+p1);

        /** Imprime las coordenadas x e y de p1 */
        System.out.println("La coordenada X es: "+ p1.getX());
        System.out.println("La coordenada Y es: "+p1.getY());

        /** Declara e instancia p2 con el constructor de Point3D.*/
        Point3D p2= new Point3D(10.0f,20.0f,30.0f);
        /** Imprime p2 usando toString() */
        System.out.println("Punto orignal: "+p2);
        /** Modifica las coordenadas x, y y z de p2 a la vez */
        p2.setXYZ(1.1f,2.2f,3.3f);
        /** Imprime p2 con las nuevas coordenadas */
        System.out.println("Punto modificado: "+ p2);

        /** Imprime las coordenadas x e y de p2 mediante array */
        System.out.println("Array XYZ: "+"["+p2.getXYZ()[0]+ ","+p2.getXYZ()[1]+"]");

        /**  Modifica solo la coordenada x de p2 */
        p2.setX(5.5f);
        /** Imprime las tres coordenadas de p2 tras el cambio mediante array */
        System.out.println("Punto después de cambiar la X: "+"("+ p2.getXYZ()[0]+","+p2.getXYZ()[1]+","+p2.getXYZ()[2]+")");
    }
}