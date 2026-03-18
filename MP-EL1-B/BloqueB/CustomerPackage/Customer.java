package BloqueB.CustomerPackage;

public class Customer {/** creamos una clase similar a de customer en customeracountpackage con diferencia de que ahora hay descuento */
    private int id;
    private String name;
    private int discount;

    public Customer(int id, String name, int discount) {/** definimos las variables que vamos a usar */
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {/** indicamos los metodos que nos van a permitir usar las vcariables */
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() { /** creamos el mismo string que en customeracountpackage pero añadiendo el descuento */
        // Formato requerido: "name(id)(discount%)"
        return name + "(" + id + ")(" + discount + "%)";
    }
}
