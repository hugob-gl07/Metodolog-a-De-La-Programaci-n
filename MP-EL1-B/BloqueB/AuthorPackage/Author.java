package BloqueB.AuthorPackage;

/**
 * Representa un autor con nombre, email y género.
 */
public class Author {

    private String name;  // Nombre del autor
    private String email; // Email del autor
    private char gender;  // Género del autor

    /** Constructor con nombre, email y género.*/
    public Author(String name, String email, char gender) {
        this.name = name;     // Guardamos el nombre del autor
        this.email = email;   // Guardamos el email del autor
        this.gender = gender; // Guardamos el género del autor
    }

    /** Devuelve el nombre del autor.*/
    public String getName() {
        return name; // Devolvemos el nombre del autor
    }

    /** Devuelve el email del autor.*/
    public String getEmail() {
        return email; // Devolvemos el email del autor
    }

    /** Devuelve el género del autor.*/
    public char getGender() {
        return gender; // Devolvemos el género del autor
    }

    /** Modifica el email del autor.*/
    public void setEmail(String email) {
        this.email = email; // Actualizamos el email del autor
    }

    /** Devuelve una representación en texto del autor.*/
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}