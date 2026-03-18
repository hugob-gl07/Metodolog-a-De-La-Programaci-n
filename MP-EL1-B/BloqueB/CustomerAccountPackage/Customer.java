package BloqueB.CustomerAccountPackage;

/**
 * Representa un cliente con ID, nombre y género.
 */
public class Customer {  /** Definimos la clase Customer con sus atributos principales. */

private int id;     // Identificador único del cliente
    private String name; // Nombre del cliente
    private char gender; // Género del cliente

    /** Constructor con ID, nombre y género. */
    public Customer(int id, String name, char gender) {
        this.id = id;     // Guardamos el ID del cliente
        this.name = name; // Guardamos el nombre del cliente
        this.gender = gender; // Guardamos el género del cliente
    }

    /** Devuelve el ID del cliente. */
    public int getId() {
        return id;  // Devolvemos el ID del cliente
    }

    /** Devuelve el nombre del cliente. */
    public String getName() {
        return name;  // Devolvemos el nombre del cliente
    }

    /** Devuelve el género del cliente. */
    public char getGender() {
        return gender;  // Devolvemos el género del cliente
    }

    /** Devuelve una representación en texto del cliente. */
    @Override
    public String toString() {
        return name + "(" + id + ")";  // Concatenamos nombre e ID entre paréntesis
    }
}
