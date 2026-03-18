package BloqueB.CustomerPackage;

public class Invoice {/** creamos una clase de invoice donde pediremos datos de unos clientes y seran las variables */
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) { /** definimso las variables */
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {/** en estos metodos ya diferenciaremos entre getters (get) y setters (set) donde los getter nos permiten obtener y usar el dato de la variable y los setter hacen que pasemos al siguiernte dato al que apunta esa variable, un ejemplo seria pasar del cliente 1 al 2 */
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {/** este getter es distinto, ya que antes de darnos el dato le aplica a la cuenta del cliente un descuento */
        double discountAmount = amount * (customer.getDiscount() / 100.0);
        return amount - discountAmount;
    }

    @Override
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer.toString() + ",amount=" + amount + "]";
    }
}
