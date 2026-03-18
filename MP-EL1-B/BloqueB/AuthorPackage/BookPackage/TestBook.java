package BloqueB.AuthorPackage.BookPackage;
import BloqueB.AuthorPackage.Author;
public class TestBook {
    public static void main(String[] args) { /** creamos un tester para imprimir por pantralla los datos del libro */
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());

        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95, 28); /** añadimos desde aqui los datos que queremos poner al libro para que se vean al imprimir */
        System.out.println(anotherBook);
    }
}
