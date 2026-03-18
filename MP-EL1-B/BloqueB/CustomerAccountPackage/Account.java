package BloqueB.CustomerAccountPackage;

public class Account { /** creamos una clase para meter las variables y los datos de las cuentas de gente en alguna paagina o servicio */
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) { /** definimos las variables */
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }


    public int getId() { /** creamos metodos par obtener los datos tanto de esta clase como de la clase customer de este mismo paquete */
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) { /** creamos dos metodos los cuales al balance generado nos sumara un cantridad, el amount, pero si el balance es mayor, se lo resta */
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    @Override
    public String toString() { /** creamos un string que nos de el balance del cliente */

        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }
}
