package src.Ejercicios.Ball;
/**
 * Probador para la clase Ball
 */
public class TestBall {
    public static void main(String[] args){
    /** Declara e instancia ball con el constructor completo */
        Ball ball=new Ball(1.1f,2.2f,10,3.3f, 4.4f);
    /** Imprime ball usando toString() */
        System.out.println(ball);
    /** Modifica la posición, el radio y velocidad de ball */
        ball.setX(80.0f);
        ball.setY(35.0f);
        ball.setRadius(5);
        ball.setxDelta(4.0f);
        ball.setyDelta(6.0f);
    /** Imprime ball con los nuevos valores */
        System.out.println(ball);
        System.out.println(("x is: "+ ball.getX()));
        System.out.println(("y is: "+ ball.getY()));
        System.out.println("radius is: "+ ball.getRadius());
        System.out.println("xDelta is: " +ball.getxDelta());
        System.out.println("yDelta is: "+ball.getyDelta());
    /** Límite del área de rebote */
        float xMin=0.0f;
        float xMax= 100.0f;
        float yMin=0.0f;
        float yMax=50.0f;
    /** Mueve la pelota 15 veces rebotando en los límites */
        for (int i=0; i<15; i++){
    /** Mueve la pelota sumando la velocidad actual */
            ball.move();
    /** Imprime la nueva posición */
            System.out.println(ball);
    /** Obtiene la posición y radio actuales */
            float xNew=ball.getX();
            float yNew= ball.getY();
            int radius=ball.getRadius();
    /** Si la pelota toca el límite horizontal inverte su dirección */
            if ((xNew+radius)>xMax || (xNew-radius)<xMin){
                ball.reflectHorizontal();
            }
    /** Si la pelota toca el límite vertical inverte su dirección */
            if ((yNew+radius)>yMax || (yNew-radius)<yMin){
                ball.reflectVertical();
            }
        }

    }
}
