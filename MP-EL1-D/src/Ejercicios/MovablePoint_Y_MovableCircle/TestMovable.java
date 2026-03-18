package Ejercicios.MovablePoint_Y_MovableCircle;

public class TestMovable {
    public static void main(String[] args) {
        // Ejemplo de Polimorfismo: Una variable de tipo interfaz (Movable)
        // puede almacenar objetos de cualquier clase que la implemente.
        Movable m1 = new MovablePoint(5, 5, 10, 10); 
        m1.moveUp();
        System.out.println("Punto: " + m1);

        // Aquí m2, siendo del mismo tipo Movable, ahora se comporta como un círculo.
        Movable m2 = new MovableCircle(2, 1, 2, 2, 20); 
        m2.moveRight();
        System.out.println("Círculo: " + m2);
    }
}
