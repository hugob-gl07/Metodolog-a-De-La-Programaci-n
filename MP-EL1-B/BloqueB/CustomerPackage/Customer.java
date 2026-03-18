package BloqueB.CustomerPackage;

/**
 * Representa un cliente con ID, nombre y porcentaje de descuento.
 */
public class Customer {  /** Definimos la clase Customer con atributos extendidos para descuentos. */

private int id;       // Identificador único del cliente
    private String name;  // Nombre del cliente
    private int discount; // Porcentaje de descuento del cliente

    /** Constructor con ID, nombre y porcentaje de descuento. */
    public Customer(int id, String name, int discount) {
        this.id = id;       // Guardamos el ID del cliente
        this.name = name;   // Guardamos el nombre del cliente
        this.discount = discount;  // Guardamos el porcentaje de descuento
    }

    /** Devuelve el ID del cliente. */
    public int getId() {
        return id;  // Devolvemos el ID del cliente
    }

    /** Devuelve el nombre del cliente. */
    public String getName() {
        return name;  // Devolvemos el nombre del cliente
    }

    /** Devuelve el porcentaje de descuento del cliente. */
    public int getDiscount() {
        return discount;  // Devolvemos el porcentaje de descuento
    }

    /** Modifica el porcentaje de descuento del cliente. */
    public void setDiscount(int discount) {
        this.discount = discount;  // Actualizamos el porcentaje de descuento
    }

    /** Devuelve una representación en texto del cliente con descuento. */
    @Override
    public String toString() {
        // Formato requerido: "name(id)(discount%)"
        return name + "(" + id + ")(" + discount + "%)";  // Concatenamos nombre, ID y descuento formateado
    }
}
