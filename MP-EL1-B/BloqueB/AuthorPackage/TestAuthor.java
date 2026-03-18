package BloqueB.AuthorPackage;

/**
 * Probador para la clase Author.
 */
public class TestAuthor {
    public static void main(String[] args) {
        /**
         * Declara e instancia ahTeck con el constructor de Author.
         * Nombre: "Tan Ah Teck", Email: "ahteck@nowhere.com", Género: 'm'
         */
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        // Imprimimos ahTeck usando toString()
        System.out.println(ahTeck);

        // Modificamos el email de ahTeck
        ahTeck.setEmail("paulTan@nowhere.com");

        // Imprimimos el nombre, email y género de ahTeck mediante getters
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}