package src.Ejercicios.Time;
/**
 * Representa una hora con horas, minutos y segundos.
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
/** Constructor con hora, minutos y segundos. */
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
/** Devuelve la hora. */
    public int getHour(){
        return hour;
    }
/** Devuelve los minutos */
    public int getMinute(){
        return minute;
    }
/** Devuelve los segundos. */
    public int getSecond(){
        return second;
    }
/** Modifica la hora. */
    public void setHour(int hour){
        this.hour=hour;
    }
/** Modifica los minutos. */
    public void setMinute(int minute){
        this.minute=minute;
    }
/** Modifica los segundos */
    public void setSecond(int second){
        this.second=second;
    }
/** Modifica las horas, minutos y segundos del tiempo */
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
/** Devuelve una representación en texto de la hora en formato hh:mm:ss. */
    public String toString(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }
/**
 * Avanza la hora un segundo.
 * Si los segundos llegan a 60 incrementa los minutos.
 * Si los minutos llegan a 60 incrementa las horas.
 * Si las horas llegan a 24 reinicia a 00:00:00.
 */
    public Time nextSecond() {
        this.second++;

        if (this.second == 60) {
            this.second = 0;
            this.minute++;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour++;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }

        }
       return this;
    }
/**
 * Retrocede la hora un segundo.
 * Si los segundos llegan a -1 decrementa los minutos y pone los segundos a 59.
 * Si los minutos llegan a -1 decrementa las horas y pone los minutos a 59.
 * Si las horas llegan a -1 reinicia a 23:59:59.
 */
    public Time previousSecond(){
        this.second--;
        if(this.second<0){
            this.second=59;
            this.minute--;

            if (this.minute<0){
                this.minute=59;
                this.hour--;

                if (this.hour<0){
                    this.hour=23;
                }
            }
        }
        return this;
    }

}
