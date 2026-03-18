package Ejercicios.Animal;
/*
El error principal de tu código no es solo la falta de constructores, sino que estás intentando "fabricar" algo imposible:
primero, intentas crear un objeto directamente de la clase Animal (new Animal()), la cual suele ser abstracta
(es decir, una idea general que no puede existir físicamente,el programa fallará al intentar hacer downcasting incorrecto;
esto es como si intentaras convencer al ordenador de que un objeto que creaste como perro (animal2) es en realidad un gato (cat2),
lo cual provocará que el programa se detenga por un error de lógica.

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.greets();

        Dog dog1=new Dog();
        dog1.greets();
        BigDog bigDog1 = new BigDog();
        bigDog1.greets();

        Animal animal1 = new Cat();
        animal1.greets();
        Animal animal2 = new Dog();
        animal2.greets();
        Animal animal3 = new BigDog();
        animal3.greets();
        Animal animal4 = new Animal();
 Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        Cat cat2 = (Cat)animal2;
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}
*/