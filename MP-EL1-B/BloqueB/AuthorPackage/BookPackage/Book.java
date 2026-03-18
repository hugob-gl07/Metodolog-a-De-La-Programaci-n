package BloqueB.AuthorPackage.BookPackage;
import BloqueB.AuthorPackage.Author;  /** Importamos la clase Author del paquete AuthorPackage. */
/**
 * Representa un libro con nombre, autor, precio y cantidad en stock.
 */
public class Book {  /** Definimos la clase Book con sus atributos principales. */

private String name;     // Nombre del libro
    private Author author;   // Autor del libro (objeto Author)
    private double price;    // Precio del libro
    private int qty = 0;     // Cantidad en stock (inicialmente 0)

    /** Constructor con nombre, autor, precio y cantidad. */
    public Book(String name, Author author, double price, int qty) {
        this.name = name;      // Guardamos el nombre del libro
        this.author = author;  // Guardamos el autor del libro
        this.price = price;    // Guardamos el precio del libro
        this.qty = qty;        // Guardamos la cantidad en stock
    }

    /** Devuelve el nombre del libro. */
    public String getName() {
        return name;  // Devolvemos el nombre del libro
    }

    /** Devuelve el autor del libro. */
    public Author getAuthor() {
        return author;  // Devolvemos el objeto autor
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

    /** Devuelve el nombre del autor del libro. */
    public String getAuthorName() {
        return author.getName();  // Obtenemos el nombre usando el getter del autor
    }

    /** Devuelve el email del autor del libro. */
    public String getAuthorEmail() {
        return author.getEmail();  // Obtenemos el email usando el getter del autor
    }

    /** Devuelve el género del autor del libro. */
    public char getAuthorGender() {
        return author.getGender();  // Obtenemos el género usando el getter del autor
    }

    /** Devuelve una representación en texto del libro. */
    @Override
    public String toString() {
        return "Book[name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";  // Concatenamos todos los datos del libro
    }
}
