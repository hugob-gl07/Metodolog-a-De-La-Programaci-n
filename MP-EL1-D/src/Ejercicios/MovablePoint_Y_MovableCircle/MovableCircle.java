package Ejercicios.MovablePoint_Y_MovableCircle;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed); // Inicializa el centro
        this.radius = radius;
    }

    @Override
    public void moveUp() { center.moveUp(); } // Delega el movimiento al centro

    @Override
    public void moveDown() { center.moveDown(); }

    @Override
    public void moveLeft() { center.moveLeft(); }

    @Override
    public void moveRight() { center.moveRight(); }

    @Override
    public String toString() {
        return center.toString() + ", radius=" + radius;
    }
}
