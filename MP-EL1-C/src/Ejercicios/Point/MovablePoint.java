package src.Ejercicios.Point;
/**
 * Representa un punto móvil como subclase de Point, añadiendo velocidad.
 */
public class MovablePoint extends Point {

    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    /** Constructor con posición y velocidad.*/
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    /** Constructor con velocidad dada.*/
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    /** Constructor por defecto.*/
    public MovablePoint(){
    }
    /** Devuelve la velocidad horizontal.*/
    public float getXSpeed() {
        return xSpeed;
    }
    /** Devuelve la velocidad vertical.*/
    public float getYSpeed() {
        return ySpeed;
    }

    /** Modifica la velocidad horizontal.*/
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    /** Modifica la velocidad vertical.*/
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    /** Modifica la velocidad horizontal y vertical a la vez.*/
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    /** Devuelve la velocidad horizontal y vertical como array.*/
    public float[] getSpeed(){
        float[] speed=new float[2];
        speed[0]=this.xSpeed;
        speed[1]=this.ySpeed;
        return speed;
    }
    /** Mueve el punto sumando la velocidad a la posición actual.*/
    public MovablePoint move(){
        float x=super.getX();
        float y=super.getY();
        x+=xSpeed;
        y+=ySpeed;
        super.setXY(x,y);
        return this;
    }
    /** Devuelve una representación en texto del punto móvil.*/
    @Override
    public String toString() {
        return super.toString() + ",speed=" + "("+xSpeed + "," +ySpeed +")";
    }
}