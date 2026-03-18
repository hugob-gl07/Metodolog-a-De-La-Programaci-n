package src.Ejercicios.Animal;
/**
 * Probador para las clases Animal, Mammal, Cat y Dog
 */
public class TestAnimal {
    public static void main(String[] args) {
        /** Declara e instancia a1 con el constructor de Animal.*/
        Animal a1= new Animal("Pelusa");
        /** Imprime a1 usando toString() */
        System.out.println(a1);
        /** Declara e instancia m1 con el constructor de Mammal.*/
        Mammal m1=new Mammal("Bobby");
        /** Imprime m1 usando toString() */
        System.out.println(m1);
        /** Declara e instancia c1 con el constructor de Cat.*/
        Cat c1=new Cat("Garfield");
        /** Imprime c1 usando toString() */
        System.out.println(c1);
        /** Declara e instancia d1 con el constructor de Dog.*/
        Dog d1=new Dog("Toby");
        /** Imprime d1 usando toString() */
        System.out.println(d1);
        /** c1 emite su saludo: "Meow" */
        c1.greets();
        /** d1 emite su saludo: "Woof" */
        d1.greets();
        /** d1 saluda a un perro anónimo llamado "Max": "Woooof" */
        d1.greets(new Dog("Max"));
    }
}