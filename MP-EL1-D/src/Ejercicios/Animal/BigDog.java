package Ejercicios.Animal;
//BigDog extiende a la clase Dog (clase hija).
public class BigDog extends Dog {
    //Constructor sencillo que implementa el atruuto de la clase abstracta Animal.
    public BigDog(String name) {
        super(name);
    }
//Método greets propio de BigDog
    @Override
    public void greets() {
        System.out.println("Wooow");
    }
//Al igual que la clase Dog, en caso de array con la clase Dog (que haya un BigDog y más de un Dog), tiene un método correspondiente.
    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }
//Al igual que la clase Dog, en caso de array, tiene un método correspondiente:
    public void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }
}
