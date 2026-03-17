package Ejercicios.Animal;
//Clase abstracta Animal
public abstract class Animal {
    protected String name;
//Constructor sencillo para inicializar la clase.
    public Animal(String name) {
        this.name = name;
    }
//Método abstracto que luego sera implementado de forma distinta entre sus clases hijas.
    public abstract void greets();
}
