package Ejercicios.Animal;
//Clase Gato, extiende a la clase abstracta Animal.
public class Cat extends Animal {
    //Constructor sencillo que emplea el atributo de la clase abstracta (inicializa la clase Gato).
    public Cat(String name) {
        super(name);
    }
//Método greets propio de la clase Gato.
    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
