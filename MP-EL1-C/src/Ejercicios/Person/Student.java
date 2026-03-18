package src.Ejercicios.Person;
/**
 * Representa un estudiante como subclase de Person,
 * añadiendo programa, año y cuota.
 */
public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    /** Constructor con nombre, dirección, programa, año y cuota.*/
    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    /** Devuelve el programa de estudios del estudiante.*/
    public String getProgram() {
        return program;
    }
    /** Modifica el programa de estudios del estudiante.*/
    public void setProgram(String program) {
        this.program = program;
    }
    /** Devuelve el año académico del estudiante.*/
    public int getYear() {
        return year;
    }
    /** Modifica el año académico del estudiante.*/
    public void setYear(int year) {
        this.year = year;
    }
    /** Devuelve la cuota del estudiante.*/
    public double getFee() {
        return fee;
    }
    /** Modifica la cuota del estudiante.*/
    public void setFee(double fee) {
        this.fee = fee;
    }
    /** Devuelve una representación en texto del estudiante.*/
    @Override
    public String toString() {
        return "Student["+ super.toString()+ ",program= " + program + ",year= " + year + ",fee= " + fee + "]";
    }
}