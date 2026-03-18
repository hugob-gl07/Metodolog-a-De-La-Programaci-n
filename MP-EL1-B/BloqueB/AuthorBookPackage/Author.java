package BloqueB.AuthorBookPackage;

/**
 * Representa un autor con nombre y email.
 */
public class Author {

    private String name;  // Nombre del autor
    private String email; // Email del autor

    /** Constructor con nombre y email.*/
    public Author(String name, String email) {
        this.name = name;   // Guardamos el nombre del autor
        this.email = email; // Guardamos el email del autor
    }

    /** Devuelve el nombre del autor.*/
    public String getName() {
        return name; // Devolvemos el nombre del autor
    }

    /** Devuelve el email del autor.*/
    public String getEmail() {
        return email; // Devolvemos el email del autor
    }

    /** Modifica el email del autor.*/
    public void setEmail(String email) {
        this.email = email; // Actualizamos el email del autor
    }

    /** Devuelve una representación en texto del autor.*/
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + "]"; // Devolvemos el autor en formato texto
    }
}