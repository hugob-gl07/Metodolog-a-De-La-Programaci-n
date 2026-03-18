package BloqueB.AuthorPackage.BookPackage;
import BloqueB.AuthorPackage.Author; /** importamos de la clase author de authorpackage para poder usar sus variables */
public class Book { /** definimos la clase book y indicamos las cariables que vamos a usar */
    private String name;
    private Author author;
    private double price;
    private int qty = 0;


    public Book(String name, Author author, double price, int qty) { /** definimos las variables */
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() { /** creamos los metodos que nos permitan obtener los varoles de las variables */
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

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    @Override
    public String toString() { /** creamos un string donde metemos las variables, siendo este los datos de un libro */
        return "Book[name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}
