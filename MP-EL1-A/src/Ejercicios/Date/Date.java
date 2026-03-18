package src.Ejercicios.Date;
/**
 * Representa una fecha con día, mes y año.
 */
public class Date {
    private int day;
    private int month;
    private int year;
/** Constructor con día, mes y año. */
    public Date(int day,int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
/** Devuelve el día de la fecha. */
    public int getDay(){
        return  day;
    }
/** Devuelve el mes de la fecha. */
    public int getMonth(){

        return month;
    }
/** Devuelve el año de la fecha. */
    public int getYear(){
        return year;
    }
/** Modifica el mes de la fecha. */
    public void setMonth(int month){

        this.month=month;
    }
/** Modifica el año de la fecha. */
    public void setYear(int year){

        this.year=year;
    }
/** Modifica el dia de la fecha. */
    public void setDay(int day){

        this.day=day;
    }
/** Modifica el dia, el mes y el año de la fecha */
    public void setDate(int day, int month, int year ){

        this.day=day;
        this.month=month;
        this.year=year;
    }
/** Devuelve una representación en texto de la fecha en formato dd/mm/aaaa. */
    public String toString(){
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
