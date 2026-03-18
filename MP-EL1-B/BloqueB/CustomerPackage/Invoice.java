package BloqueB.CustomerPackage;

/**
 * Representa una factura con ID, cliente y monto total.
 */
public class Invoice {  /** Definimos la clase Invoice con sus atributos principales. */

private int id;          // Identificador único de la factura
    private Customer customer; // Cliente asociado a la factura
    private double amount;   // Monto total de la factura

    /** Constructor con ID, cliente y monto de la factura. */
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;       // Guardamos el ID de la factura
        this.customer = customer;  // Guardamos el cliente de la factura
        this.amount = amount;     // Guardamos el monto total
    }

    /** Devuelve el ID de la factura. */
    public int getId() {
        return id;  // Devolvemos el ID de la factura
    }

    /** Devuelve el cliente de la factura. */
    public Customer getCustomer() {
        return customer;  // Devolvemos el objeto cliente
    }

    /** Modifica el cliente de la factura. */
    public void setCustomer(Customer customer) {
        this.customer = customer;  // Actualizamos el cliente asociado
    }

    /** Devuelve el monto total de la factura. */
    public double getAmount() {
        return amount;  // Devolvemos el monto total
    }

    /** Modifica el monto total de la factura. */
    public void setAmount(double amount) {
        this.amount = amount;  // Actualizamos el monto total
    }

    /** Devuelve el ID del cliente de la factura. */
    public int getCustomerId() {
        return customer.getId();  // Obtenemos el ID usando el getter del cliente
    }

    /** Devuelve el nombre del cliente de la factura. */
    public String getCustomerName() {
        return customer.getName();  // Obtenemos el nombre usando el getter del cliente
    }

    /** Devuelve el porcentaje de descuento del cliente. */
    public int getCustomerDiscount() {
        return customer.getDiscount();  // Obtenemos el descuento usando el getter del cliente
    }

    /** Devuelve el monto de la factura después de aplicar el descuento del cliente. */
    public double getAmountAfterDiscount() {
        double discountAmount = amount * (customer.getDiscount() / 100.0);  // Calculamos el descuento como porcentaje
        return amount - discountAmount;  // Restamos el descuento del monto original
    }

    /** Devuelve una representación en texto de la factura. */
    @Override
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer.toString() + ",amount=" + amount + "]";  // Concatenamos todos los datos de la factura
    }
}
