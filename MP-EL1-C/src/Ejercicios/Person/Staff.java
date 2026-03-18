package src.Ejercicios.Person;
/**
 * Representa un miembro del personal como subclase de Person,
 * añadiendo escuela y salario.
 */
public class Staff extends Person {
    private String school;
    private double pay;
    /** Constructor con nombre, dirección, escuela y salario.*/
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school=school;
        this.pay=pay;
    }
    /** Devuelve la escuela del miembro del personal.*/
    public String getSchool() {
        return school;
    }
    /** Modifica la escuela del miembro del personal. */
    public void setSchool(String school) {
        this.school = school;
    }
    /** Devuelve el salario del miembro del personal.*/
    public double getPay() {
        return pay;
    }
    /** Modifica el salario del miembro del personal.*/
    public void setPay(double pay) {
        this.pay = pay;
    }
    /** Devuelve una representación en texto del miembro del personal.*/
    @Override
    public String toString() {
        return "Staff[" +super.toString() + ",school= " + school + ",pay= " + pay + "]";
    }
}