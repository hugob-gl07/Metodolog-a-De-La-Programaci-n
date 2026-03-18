package Ejercicios.MovablePoint_Y_MovableCircle;

// La interfaz Movable define un "contrato de movimiento". 
// Cualquier clase que la implemente garantiza que tendrá estos cuatro métodos.
// Esto permite que el sistema trate a puntos y círculos de la misma forma (Polimorfismo).
public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
