package BloqueB.AuthorBookPackage;

/**
 * Representa un libro con ISBN, nombre, autor, precio y cantidad.
 */
public class Book {

    private String isbn;    // Identificador único del libro
    private String name;    // Nombre del libro
    private Author author;  // Autor del libro
    private double price;   // Precio del libro
    private int qty = 0;    // Cantidad disponible del libro

    /** Constructor con todos los datos del libro.*/
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;     // Guardamos el ISBN del libro
        this.name = name;     // Guardamos el nombre del libro
        this.author = author; // Guardamos el autor del libro
        this.price = price;   // Guardamos el precio del libro
        this.qty = qty;       // Guardamos la cantidad disponible
    }

    /**
     * Constructor sin cantidad inicial.
     * Cantidad por defecto: 0
     */
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;     // Guardamos el ISBN del libro
        this.name = name;     // Guardamos el nombre del libro
        this.author = author; // Guardamos el autor del libro
        this.price = price;   // Guardamos el precio del libro
    }

    /** Devuelve el ISBN del libro.*/
    public String getIsbn() {
        return isbn; // Devolvemos el ISBN del libro
    }

    /** Devuelve el nombre del libro.*/
    public String getName() {
        return name; // Devolvemos el nombre del libro
    }

    /** Devuelve el autor del libro.*/
    public Author getAuthor() {
        return author; // Devolvemos el autor del libro
    }

    /** Devuelve el precio del libro.*/
    public double getPrice() {
        return price; // Devolvemos el precio del libro
    }

    /** Modifica el precio del libro.*/
    public void setPrice(double price) {
        this.price = price; // Actualizamos el precio del libro
    }

    /** Devuelve la cantidad disponible del libro.*/
    public int getQty() {
        return qty; // Devolvemos la cantidad disponible
    }

    /** Modifica la cantidad disponible del libro.*/
    public void setQty(int qty) {
        this.qty = qty; // Actualizamos la cantidad disponible
    }

    /** Devuelve el nombre del autor del libro delegando en Author.getName().*/
    public String getAuthorName() {
        return author.getName(); // Delegamos en el método getName() de Author
    }

    /** Devuelve una representación en texto del libro.*/
    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ",name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}