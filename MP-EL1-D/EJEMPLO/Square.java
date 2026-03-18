package EJEMPLO;
//Clase cuadrado, clase hija de rectangulo.
public class Square extends Rectangle {
    //Constructores:
    public Square() {}//Constructor vacío
    public Square(double side) { super(side, side); } //Constructor simple con los elementos del cuadrado.
    public Square(double side, String color, boolean filled) {//Constructor extendido: extiende el constructor extendido del rectangulo,
                                                              //añadiendo los elementos de este (los hereda).
        super(side, side, color, filled);
    }
//Getter y setter propios de un cuadrado (a diferencia del rectangulo, ancho y longitud en el cuadrado son iguales).
    public double getSide() { return getWidth(); }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
//De este modo al ejecutar los setters del rectangulo, establecemos que length y widht son lo mismo (tienen el mismo valor: el lado).
    //cabe destacar que ambos setters devuelven el tipo básico double.
    @Override
    public void setWidth(double side) { super.setWidth(side); super.setLength(side); }
    @Override
    public void setLength(double side) { super.setLength(side); super.setWidth(side); }
//Extensión del ToString del rect<ngulo, con la diferencia de que largo y ancho tendran el mismo valor (lado).
//Cabe destacar que se devuelve por pantalla el color y el relleno de la clase abstracta Shape gracias al ToString, que sobrecarga el método
    //Devyuelve por pantalla el tipo básico string.
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
