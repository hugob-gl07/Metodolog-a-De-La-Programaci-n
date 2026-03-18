package src.Ejercicios.Time;
/**
 * Probador para la clase Time
 */
public class TestTime {
    public static void main(String[] args) {
    /** Declara e instancia t1 con el constructor completo. */
        Time t1 = new Time(1, 2, 3);
    /** Imprime t1 usando toString() */
        System.out.println(t1);
    /** Modifica la hora, minutos y segundos de t1 individualmente */
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
    /** Imprime t1 con los nuevos valores */
        System.out.println(t1);
    /** Imprime la hora, minutos y segundos de t1 */
        System.out.println("Hour: " + t1.getHour());
        System.out.println(("Minute: "+ t1.getMinute()));
        System.out.println("Second: "+ t1.getSecond());
    /** Modifica la hora, minutos y segundos de t1 a la vez */
        t1.setTime(23,59,58);
    /** Imprime t1 con los nuevos valores */
        System.out.println(t1);
    /** Avanza t1 un segundo e imprime el resultado */
        System.out.println(t1.nextSecond());
    /** Avanza t1 dos segundos encadenando llamadas e imprime el resultado */
     System.out.println(t1.nextSecond().nextSecond());
    /** Retrocede t1 un segundo e imprime el resultado */
        System.out.println(t1.previousSecond());
    /** Retrocede t1 dos segundos encadenando llamadas e imprime el resultado */
        System.out.println(t1.previousSecond().previousSecond());
    }
}
