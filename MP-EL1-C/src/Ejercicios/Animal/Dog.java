package src.Ejercicios.Animal;
/**
 * Representa un perro como subclase de Mammal.
 */
public class Dog extends Mammal {
    /** Constructor con nombre.*/
    public Dog(String name){
        super(name);
    }
    /** Imprime el saludo del perro.*/
    public void greets(){
        System.out.println("Woof");
    }
    /** Imprime el saludo del perro cuando saluda a otro perro.*/
    public void greets(Dog another){
        System.out.println("Woooof");
    }
    /** Devuelve una representación en texto del perro.*/
    @Override
    public String toString() {
        return "Dog[" + super.toString() +"]";
    }
}