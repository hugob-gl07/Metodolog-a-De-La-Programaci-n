package Ejercicios.Ball;

/**
 * Representa una pelota con posición, radio y velocidad
 */
public class Ball {

    private float x;
    private  float y;
    private  int radius;
    private float xDelta;
    private float yDelta;
/** Constructor con posición, radio y velocidad. */
    public Ball(float x, float y, int radius, float xDelta, float yDelta){

        this.x= x;
        this.y=y;
        this.radius=radius;
        this.xDelta=xDelta;
        this.yDelta=yDelta;
    }
/** Devuelve la posición horizontal */
    public float getX() {
        return x;
    }
/** Modifica la posición horizontal */
    public void setX(float x) {
        this.x = x;
    }
/** Devuelva la posición vertical */
    public float getY() {
        return y;
    }
    /** Modifica la posición vertical */
    public void setY(float y) {
        this.y = y;
    }
/** Devuelve el radio de la pelota */
    public int getRadius() {
        return radius;
    }
/** Modifica el radio de la pelota */
    public void setRadius(int radius) {
        this.radius = radius;
    }
/** Devuelve la velocidad horizontal */
    public float getxDelta() {
        return xDelta;
    }
/** Modifica la velocidad horizontal */
    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }
/** Devuelve la velocidad vertical */
    public float getyDelta() {
        return yDelta;
    }
/** Modifica la velocidad vertical */

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
/** Mueve la pelota sumando la velocidad a la posición asctual */
    public void move(){

        x+=xDelta;
        y+=yDelta;
    }
/** Invierte la dirección horizontal de la pelota */
    public void reflectHorizontal(){
        xDelta=-xDelta;
    }
    /** Invierte la dirección vertical de la pelota */

    public void reflectVertical(){

        yDelta=-yDelta;
    }
/** Devuelve una representación en texto de la pelota. */
    @Override
    public String toString() {
        return "Ball.Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+")]";
    }
}
