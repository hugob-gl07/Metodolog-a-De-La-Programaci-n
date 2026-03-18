package Circle;
/**
 * Representamos un círculo con un radio y un color.
 */
public class Circle {
    private double radius;
    private String color;
// Constructores
    /** Constructor por defecto */
    public Circle(){
        radius=1.0;
        color="red";
    }
    /** Constructor con radio dado y color por defecto*/
    public Circle(double r){
        radius=r;
        color="red";
    }
    /** Constructor con el radio y el color dados. */
    public Circle(double radius, String color){
        this.radius=radius;
        this.color= color;
    }
    /** Devuelve el radío del Círculo*/
    public double getRadius(){
        return radius;
    }
    /** Calcular y devolver el área del círculo*/
    public double getArea(){

        return radius*radius*Math.PI;

    }
    /** Devolver el color del círculo*/
    public String getColor(){

        return color;
    }
    /** Modifica el radio del círculo*/
    public void setRadius(double newRadius){
        this.radius=newRadius;
    }
    /**Modifca el color del Círculo*/
    public void setColor(String newColor){

        color=newColor;
    }
    /**Calcula y devuelve la circuferencia del círculo*/
    public double getCircumference(){

        return 2*Math.PI*radius;
    }
    /** Devuelve una representación en texto del Círculo*/
    public String toString(){
        return "Circle.Circle[radius="+ radius + " color= " + color + "]";
    }

}