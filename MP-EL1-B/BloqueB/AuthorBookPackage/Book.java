package BloqueB.AuthorBookPackage;

public class Book { /** creamos una serie de datos privados que usaremos mas adelantre */
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String isbn, String name, Author author, double price, int qty) { /** creamos esta clase para definir las variables anteriores */
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public Book(String isbn, String name, Author author, double price) { /** creamos esta clase para definir las variables anteriores pero sin la cantidad de libros */
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getIsbn() { /** una vez que tenemos en valor de cada variable creamos distintos metodos para poder obtener las variables usando solo el metodo el metodo get en otra clase*/
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    @Override
    public String toString() { /** creamos un string donde añadimos en una variable string todas las variables anteriores formando asi los datos de un libro */
        return "Book[isbn=" + isbn + ",name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}
