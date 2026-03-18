package Ejercicios.Animal;

import Ejercicios.Animal1.Animal;

// Dog extiende a Animal e introduce la interacción entre objetos del mismo tipo.
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Sobrescritura del método básico de Animal.
    @Override
    public void greets() {
        System.out.println("Woof");
    }

    // SOBRECARGA: Nuevo método que permite interactuar con otro perro.
    // No usa @Override porque Animal no conocía este método con parámetros.
    public void greets(Dog another) {
        System.out.println("Woooof");//Devuelve por pantalla el resultado del método greets propio cuando hay más de un perro (Sobrecarga).
    }
}
