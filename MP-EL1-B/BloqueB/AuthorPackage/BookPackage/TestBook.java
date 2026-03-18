package BloqueB.AuthorPackage.BookPackage;

import BloqueB.AuthorPackage.Author;  /** Importamos la clase Author del paquete AuthorPackage. */

public class TestBook {  /** Clase principal para probar la funcionalidad de Book. */

public static void main(String[] args) {  /** Método principal que ejecuta las pruebas. */
    Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');  // Creamos un objeto Author de prueba
    System.out.println(ahTeck);  // Mostramos la información del autor

    Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Creamos un libro de prueba con el autor anterior
    System.out.println(dummyBook);  // Mostramos la información completa del libro

    dummyBook.setPrice(29.95);   // Modificamos el precio del libro
    dummyBook.setQty(28);        // Modificamos la cantidad en stock
    System.out.println("name is: " + dummyBook.getName());           // Mostramos el nombre del libro
    System.out.println("price is: " + dummyBook.getPrice());         // Mostramos el nuevo precio
    System.out.println("qty is: " + dummyBook.getQty());             // Mostramos la nueva cantidad
    System.out.println("Author is: " + dummyBook.getAuthor());       // Mostramos el objeto autor

    System.out.println("Author's name is: " + dummyBook.getAuthor().getName());  // Mostramos el nombre del autor vía Book
    System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());  // Mostramos el email del autor vía Book

    Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95, 28);  // Creamos otro libro con nuevo autor inline
    System.out.println(anotherBook);  // Mostramos la información del segundo libro
}
}
