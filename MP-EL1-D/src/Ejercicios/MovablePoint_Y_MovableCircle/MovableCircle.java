package Ejercicios.MovablePoint_Y_MovableCircle;

// MovableCircle representa un círculo que puede desplazarse.
// En lugar de reinventar la lógica de movimiento, utiliza la composición.
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center; // Composición: El círculo "tiene un" punto central.

    // El constructor crea internamente un objeto MovablePoint para gestionar el centro.
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed); 
        this.radius = radius;
    }

    // --- DELEGACIÓN DE FUNCIONES ---

    // El círculo no sabe cómo moverse, así que le "pide" al punto (center) que lo haga.
    // Esto es un patrón de diseño que evita duplicar lógica matemática y facilita mucho la i mplementación.
    @Override
    public void moveUp() { center.moveUp(); } 

    @Override
    public void moveDown() { center.moveDown(); }

    @Override
    public void moveLeft() { center.moveLeft(); }

    @Override
    public void moveRight() { center.moveRight(); }

    // Reutiliza el toString del centro y le añade la información del radio.
    //básicamente, sobrecarga el método ToString de MovablePoint y lo devuelve como el tipo básico string
    @Override
    public String toString() {
        return center.toString() + ", radius=" + radius;
    }
}
