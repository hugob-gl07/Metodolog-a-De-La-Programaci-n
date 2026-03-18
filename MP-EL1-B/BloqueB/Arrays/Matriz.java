package BloqueB.Arrays;
/**
 * Clase que genera una matriz de distancias entre puntos en el plano.
 * Crea 10 puntos y calcula la distancia entre cada par de puntos.
 */
public class Matriz {
    public static void main(String[] args) {

        // Creamos un array de 10 puntos
        MyPoint[] puntos = new MyPoint[10];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new MyPoint(i + 1, i + 1); // Cada punto tiene coordenadas (i+1, i+1)
        }
        System.out.println("--- Matriz de Distancias ---");

        // Recorremos todos los puntos i
        for (int i = 0; i < puntos.length; i++) {
            // Para cada punto i calculamos su distancia con todos los puntos j
            for (int j = 0; j < puntos.length; j++) {
                double distancia = puntos[i].distance(puntos[j]); // Calculamos la distancia entre el punto i y el punto j
                System.out.printf("%6.2f ", distancia); // Imprimimos la distancia con 2 decimales y 6 caracteres de ancho
            }
            System.out.println(); // Saltamos de línea al terminar cada fila
        }
    }
}