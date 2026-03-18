package BloqueB.Arrays;

public class Matriz { /** en esta clase buscaremos crear puntos y medir la distancia entre ellos*/
    public static void main(String[] args) {
        MyPoint[] puntos = new MyPoint[10];
        for (int i = 0; i < puntos.length; i++) {  /** definimos los puntos en base a un punto i = 0 en x e y en el plano*/
            puntos[i] = new MyPoint(i + 1, i + 1);
        }

        System.out.println("--- Matriz de Distancias ---");
        for (int i = 0; i < puntos.length; i++) {  /** en funcion del bucle de los puntos de i formamos unos puntos j*/
            for (int j = 0; j < puntos.length; j++) {
                double distancia = puntos[i].distance(puntos[j]);/** tomamos la distancia que hay entre los puntos i y los j y la imprimimos */
                System.out.printf("%6.2f ", distancia);
            }
            System.out.println();
        }
    }
}
