package Ejercicios.Animal1;
/**
 * Representa un gato como subclase de Mammal.
 */
public class Cat extends Mammal {
    /** Constructor con nombre.*/
    public Cat(String name){
        super(name);
    }
    /** Imprime el sonido del gato.*/
    public void greets(){
        System.out.println("Meow");
    }
    /** Devuelve una representación en texto del gato.*/
    @Override
    public String toString() {
        return "Cat["+ super.toString() + "]";
    }
}