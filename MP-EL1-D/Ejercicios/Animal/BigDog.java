package Ejercicios.Animal;

import Ejercicios.Animal1.Dog;

// BigDog hereda de Dog, aprovechando toda su estructura previa.
public class BigDog extends Ejercicios.Animal1.Dog {
    //constructor básico
    public BigDog(String name) {
        super(name);
    }

    // Sobrescribe el saludo básico de Dog/Animal.
    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    // Sobrescribe el método de Dog para cuando se encuentra con un perro normal.
    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    // Nueva sobrecarga específica: Saludo especial cuando se encuentran 
    // dos perros grandes. Es el nivel más específico de la jerarquía.
    public void greets(BigDog another) {
        System.out.println("Wooooooooow");//Devuelve por pantalla el método greets cuuando hay más de un BigDog (sobrecarga).
    }
}
