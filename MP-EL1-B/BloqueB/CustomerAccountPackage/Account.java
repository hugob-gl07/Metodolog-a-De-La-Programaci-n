package BloqueB.CustomerAccountPackage;

/**
 * Representa una cuenta bancaria con ID, cliente y saldo.
 */
public class Account {  /** Definimos la clase Account con sus atributos principales. */

private int id;           // Identificador único de la cuenta
    private Customer customer; // Cliente propietario de la cuenta
    private double balance = 0.0;  // Saldo inicial (por defecto 0.0)

    /** Constructor con ID, cliente y saldo inicial. */
    public Account(int id, Customer customer, double balance) {
        this.id = id;       // Guardamos el ID de la cuenta
        this.customer = customer;  // Guardamos el cliente de la cuenta
        this.balance = balance;    // Guardamos el saldo inicial
    }

    /** Devuelve el ID de la cuenta. */
    public int getId() {
        return id;  // Devolvemos el ID de la cuenta
    }

    /** Devuelve el cliente de la cuenta. */
    public Customer getCustomer() {
        return customer;  // Devolvemos el objeto cliente
    }

    /** Devuelve el saldo actual de la cuenta. */
    public double getBalance() {
        return balance;  // Devolvemos el saldo actual
    }

    /** Modifica el saldo de la cuenta. */
    public void setBalance(double balance) {
        this.balance = balance;  // Actualizamos el saldo de la cuenta
    }

    /** Devuelve el nombre del cliente de la cuenta. */
    public String getCustomerName() {
        return customer.getName();  // Obtenemos el nombre usando el getter del cliente
    }

    /** Realiza un depósito y devuelve la cuenta (método encadenable). */
    public Account deposit(double amount) {
        this.balance += amount;  // Sumamos la cantidad al saldo actual
        return this;  // Devolvemos la misma cuenta para encadenar operaciones
    }

    /** Realiza un retiro si hay saldo suficiente y devuelve la cuenta. */
    public Account withdraw(double amount) {
        if (this.balance >= amount) {  // Verificamos si hay saldo suficiente
            this.balance -= amount;    // Restamos la cantidad del saldo
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");  // Mensaje de error
        }
        return this;  // Devolvemos la misma cuenta para encadenar operaciones
    }

    /** Devuelve una representación en texto de la cuenta. */
    @Override
    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);  // Concatenamos datos del cliente y saldo formateado
    }
}
