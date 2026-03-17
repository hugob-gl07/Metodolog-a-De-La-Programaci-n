package Ejercicios.MovablePoint_Y_MovableCircle;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed; // Acceso de paquete [cite: 159, 160, 162, 163]

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() { y -= ySpeed; }

    @Override
    public void moveDown() { y += ySpeed; }

    @Override
    public void moveLeft() { x -= xSpeed; }

    @Override
    public void moveRight() { x += xSpeed; }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
