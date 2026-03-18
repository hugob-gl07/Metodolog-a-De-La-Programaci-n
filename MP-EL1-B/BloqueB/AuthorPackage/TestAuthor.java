package BloqueB.AuthorPackage;

public class TestAuthor { /** creamos una clase tester para probar el codigo, pidiendo al programa que imprima las soluciones por pantalla */
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

        System.out.println(ahTeck);

        ahTeck.setEmail("paulTan@nowhere.com");

        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}
