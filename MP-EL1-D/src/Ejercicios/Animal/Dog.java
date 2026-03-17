package Ejercicios.Animal;
//Extiende a la clase Animal
public class Dog extends Animal {
    //Constructor sencillo extendiendo el atributo nombre de la clase abstracta.
    public Dog(String name) {
        super(name);
    }
//Método greets propio de la clase perro
    @Override
    public void greets() {
        System.out.println("Woof");
    }
//Método greets en el caso de que tengamos un array de la clase perro.
    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}
