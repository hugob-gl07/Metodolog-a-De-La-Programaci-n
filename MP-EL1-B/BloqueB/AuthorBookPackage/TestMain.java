package BloqueB.AuthorBookPackage;

/**
 * Probador para las clases Author y Book.
 */
public class TestMain {
    public static void main(String[] args) {

        /**
         * Declara e instancia a1 con el constructor de Author.
         * Nombre: "Tan Ah Teck", Email: "ahteck@nowhere.com"
         */
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        // Imprimimos a1 usando toString()
        System.out.println(a1);

        // Modificamos el email de a1
        a1.setEmail("ahteck@somewhere.com");
        // Imprimimos a1 con el nuevo email
        System.out.println(a1);

        // Imprimimos el nombre y email de a1 mediante getters
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());

        /**
         * Declara e instancia b1 con el constructor completo de Book.
         * ISBN: "12345", Nombre: "Java for dummies", Autor: a1, Precio: 8.8, Cantidad: 88
         */
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        // Imprimimos b1 usando toString()
        System.out.println(b1);

        // Modificamos el precio y la cantidad de b1
        b1.setPrice(9.9);
        b1.setQty(99);
        // Imprimimos b1 con los nuevos valores
        System.out.println(b1);

        // Imprimimos cada atributo de b1 mediante getters
        System.out.println("isbn is: " + b1.getIsbn());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author is: " + b1.getAuthor());
        // Imprimimos el nombre del autor mediante getAuthorName()
        System.out.println("author's name: " + b1.getAuthorName());
        // Imprimimos el nombre del autor accediendo directamente al objeto Author
        System.out.println("author's name: " + b1.getAuthor().getName());
        // Imprimimos el email del autor accediendo directamente al objeto Author
        System.out.println("author's email: " + b1.getAuthor().getEmail());
    }
}