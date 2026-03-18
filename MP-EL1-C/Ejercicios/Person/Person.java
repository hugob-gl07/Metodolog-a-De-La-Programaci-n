package Ejercicios.Person;
/**
 * Representa una persona con nombre y dirección.
 */
public class Person {
    private String name;
    private String address;
    /** Constructor con nombre y dirección.*/
    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }
    /** Devuelve el nombre de la persona.*/
    public String getName() {
        return name;
    }
    /** Modifica la dirección de la persona.*/
    public void setAddress(String address) {
        this.address = address;
    }
    /** Devuelve la dirección de la persona.*/
    public String getAddress() {
        return address;
    }
    /** Devuelve una representación en texto de la persona.*/
    @Override
    public String toString(){
        return "Person[name= " + name + ",address= " + address + "]";
    }
}