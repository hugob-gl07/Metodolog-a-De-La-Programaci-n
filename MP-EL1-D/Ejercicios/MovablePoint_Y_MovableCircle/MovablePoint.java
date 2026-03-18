package Ejercicios.MovablePoint_Y_MovableCircle;

// Esta clase representa un punto en un plano cartesiano con velocidad propia.
// Es la pieza fundamental sobre la que se construyen otros objetos móviles.
public class MovablePoint implements Movable {
    // Atributos de posición y velocidad con acceso de paquete.
    int x, y, xSpeed, ySpeed; 

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // --- LÓGICA DE MOVIMIENTO ---

    // Restamos velocidad a 'y' para subir (según el estándar de coordenadas gráficas).
    @Override
    public void moveUp() { y -= ySpeed; }

    // Sumamos velocidad a 'y' para bajar en el eje vertical.
    @Override
    public void moveDown() { y += ySpeed; }

    // Desplazamiento horizontal hacia la izquierda (resta en el eje x).
    @Override
    public void moveLeft() { x -= xSpeed; }

    // Desplazamiento horizontal hacia la derecha (suma en el eje x).
    @Override
    public void moveRight() { x += xSpeed; }

    // Devuelve la posición y la velocidad actual en un formato legible.
    //Lo muestra por pantalla como el tipo básico string.
    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
