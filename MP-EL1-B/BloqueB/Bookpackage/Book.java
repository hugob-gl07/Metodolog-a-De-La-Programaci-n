package BloqueB.Bookpackage;

import BloqueB.AuthorPackage.Author;  /** Importamos la clase Author del paquete AuthorPackage. */

/**
 * Representa un libro con múltiples autores, nombre, precio y cantidad en stock.
 */
public class Book {  /** Definimos la clase Book que soporta múltiples autores mediante un array. */

private String name;        // Nombre del libro
    private Author[] authors;   // Array de autores del libro
    private double price;       // Precio del libro
    private int qty = 0;        // Cantidad en stock (inicialmente 0)

    /** Constructor completo con nombre, array de autores, precio y cantidad. */
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;       // Guardamos el nombre del libro
        this.authors = authors; // Guardamos el array de autores
        this.price = price;     // Guardamos el precio del libro
        this.qty = qty;         // Guardamos la cantidad en stock
    }

    /** Constructor simplificado sin cantidad (usa valor por defecto 0). */
    public Book(String name, Author[] authors, double price) {
        this.name = name;       // Guardamos el nombre del libro
        this.authors = authors; // Guardamos el array de autores
        this.price = price;     // Guardamos el precio del libro
        // qty mantiene valor por defecto 0
    }

    /** Devuelve el nombre del libro. */
    public String getName() {
        return name;  // Devolvemos el nombre del libro
    }

    /** Devuelve el array de autores del libro. */
    public Author[] getAuthors() {
        return authors;  // Devolvemos el array completo de autores
    }

    /** Devuelve el precio del libro. */
    public double getPrice() {
        return price;  // Devolvemos el precio del libro
    }

    /** Modifica el precio del libro. */
    public void setPrice(double price) {
        this.price = price;  // Actualizamos el precio del libro
    }

    /** Devuelve la cantidad en stock del libro. */
    public int getQty() {
        return qty;  // Devolvemos la cantidad en stock
    }

    /** Modifica la cantidad en stock del libro. */
    public void setQty(int qty) {
        this.qty = qty;  // Actualizamos la cantidad en stock
    }

    /** Devuelve los nombres de todos los autores separados por comas. */
    public String getAuthorNames() {
        String names = "";  // Inicializamos cadena vacía para concatenar nombres
        for (int i = 0; i < authors.length; i++) {
            names += authors[i].getName();  // Añadimos nombre del autor actual
            if (i < authors.length - 1) {   // Si no es el último autor
                names += ", ";              // Añadimos coma y espacio
            }
        }
        return names;  // Devolvemos la lista de nombres formateada
    }

    /** Devuelve una representación en texto del libro con todos los autores. */
    @Override
    public String toString() {
        String authorsStr = "";  // Inicializamos cadena para autores
        for (int i = 0; i < authors.length; i++) {
            authorsStr += authors[i].toString();  // Añadimos representación del autor
            if (i < authors.length - 1) {         // Si no es el último autor
                authorsStr += ", ";               // Añadimos coma y espacio
            }
        }
        return "Book[name=" + name + ",authors={" + authorsStr + "},price=" + price + ",qty=" + qty + "]";  // Concatenamos todos los datos del libro
    }
}
