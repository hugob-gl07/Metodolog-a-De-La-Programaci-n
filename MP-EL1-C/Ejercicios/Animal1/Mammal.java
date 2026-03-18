package Ejercicios.Animal1;
/**
 * Representa un mamífero como subclase de Animal.
 */
public class Mammal extends Animal {
    /** Constructor con nombre.*/
    public Mammal(String name){
        super(name);
    }
    /** Devuelve una representación en texto del mamífero.*/
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}