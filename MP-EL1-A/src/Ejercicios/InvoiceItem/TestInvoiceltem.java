package src.Ejercicios.InvoiceItem;
/**
 * Probador para la clase InvoiceItem
 */
public class TestInvoiceltem {
    public static void main(String[] args){
    /** Declara e instancia inv1 con el constructor completo. */
        InvoiceItem inv1= new InvoiceItem("A101","Pen Red",888,0.88);
    /** Imprime inv1 usando toString() */
        System.out.println(inv1);
    /** Modifica la cantidad y el precio unitario de inv1 */
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
    /** Imprime inv1 con los nuevos valores */
        System.out.println(inv1);
    /** Imprime cada atributo de inv1 */
        System.out.println("id is: "+ inv1.getId());
        System.out.println("desc is: "+ inv1.getDesc());
        System.out.println("qty is: "+ inv1.getQty());
        System.out.println("unitPrice is: "+ inv1.getUnitPrice());
    /** Imprime el total de inv1 multiplicando cantidad por precio unitario */
        System.out.println("The total is: "+ inv1.getTotal());

    }

}
