package Ejercicios.Animal;

// Clase base abstracta que define la esencia de cualquier Animal.
// No se pueden crear objetos directamente de 'Animal', sirve como plantilla.
public abstract class Animal {
    protected String name; // Atributo protegido para que las clases hijas lo hereden.
//Constructor sencillo para inicializar la clase.
    public Animal(String name) {
        this.name = name;
    }

    // Método abstracto: cada animal saluda de forma distinta, por lo que 
    // la implementación se delega obligatoriamente a las clases hijas.
    public abstract void greets();
}
