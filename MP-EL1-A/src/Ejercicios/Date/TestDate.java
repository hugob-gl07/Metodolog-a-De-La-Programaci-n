package src.Ejercicios.Date;
/**
 * Probador para la clase Date
 */
public class TestDate {
    public static void main(String[] args){
    /** Declara e instancia d1 con el constructor completo.*/
        Date d1=new Date(1,2,2014);
    /** Imprime d1 usando toString() */
        System.out.println(d1);
    /** Modifica el día, mes y año de d1 individualmente */
        d1.setDay(9);
        d1.setMonth(12);
        d1.setYear(2099);
    /** Imprime d1 con los nuevos valores */
        System.out.println(d1);
    /** Imprime el mes, día y año de d1 */
        System.out.println("Month: "+ d1.getMonth());
        System.out.println("Day: "+ d1.getDay());
        System.out.println(("Year: "+ d1.getYear()));
    /** Modifica el día, mes y año de d1 */
        d1.setDate(3,4,2016);
    /** Imprime d1 con los nuevos valores */
        System.out.println(d1);
    }

}
