package Circle1;
/**
 * Representa un cilindro como subclase de Circle, añadiendo altura.
 */
public class Cylinder extends Circle {

    private double height;
    /** Constructor por defecto.*/
    public Cylinder(){
        super();
        this.height=1.0;
    }
    /** Constructor con radio dado.*/
    public Cylinder(double radius){
        super(radius);
    }
    /** Constructor con radio y altura dados.*/
    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }
    /** Constructor con radio, altura y color dados.*/
    public Cylinder(double radius, double height, String color){
        super(radius,color);
        this.height=height;
    }
    /** Devuelve la altura del cilindro.*/
    public double getHeight() {
        return height;
    }
    /** Modifica la altura del cilindro.*/
    public void setHeight(double height) {
        this.height = height;
    }
    /** Calcula y devuelve el volumen del cilindro multiplicando el área de la base por la altura.*/
    public double getVolume(){
        return super.getArea()*height;
    }
    /** Devuelve una representación en texto del cilindro.*/
    @Override
    public String toString(){
        return "Circle.Cylinder: subclass of " + super.toString() + " height= " + height;
    }
}