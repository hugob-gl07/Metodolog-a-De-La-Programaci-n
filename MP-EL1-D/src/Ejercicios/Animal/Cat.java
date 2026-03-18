package Ejercicios.Animal;

// Cat es una clase concreta que hereda de Animal.
public class Cat extends Animal {
    public Cat(String name) {
        super(name); // Llama al constructor de Animal para asignar el nombre.
    }

    // Implementación específica del saludo para gatos.
    @Override
    public void greets() {
        System.out.println("Meow");//Devuelve por pantalla el método propio de la clase Cat.
    }
}
