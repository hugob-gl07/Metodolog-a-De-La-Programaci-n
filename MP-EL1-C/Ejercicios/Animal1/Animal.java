package Ejercicios.Animal1;
/**
 * Representa un animal con un nombre.
 */
public class Animal {
    private String name;
    /** Constructor con nombre.*/
    public Animal(String name){
        this.name=name;
    }
    /** Devuelve una representación en texto del animal.*/
    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }

    public void greets() {
    }
}