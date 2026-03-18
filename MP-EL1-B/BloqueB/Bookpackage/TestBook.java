package BloqueB.Bookpackage;

import BloqueB.AuthorPackage.Author;  /** Importamos la clase Author del paquete AuthorPackage. */

public class TestBook {  /** Clase principal para probar la funcionalidad de Book con múltiples autores. */

public static void main(String[] args) {  /** Método principal que ejecuta las pruebas del libro. */

    Author[] authors = new Author[2];  // Creamos un array de 2 autores
    authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');  // Asignamos primer autor al índice 0
    authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');        // Asignamos segundo autor al índice 1

    Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);  // Creamos el libro con array de autores
    System.out.println(javaDummy);  // Mostramos la información completa del libro

    System.out.println("Author names: " + javaDummy.getAuthorNames());  // Mostramos solo los nombres de los autores separados por comas
}
}
