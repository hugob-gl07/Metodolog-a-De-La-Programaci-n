package BloqueB.CustomerPackage;

/**
 * Clase principal para probar la funcionalidad de Customer e Invoice.
 */
public class TeistMain {  /** Definimos la clase de pruebas principal. */

public static void main(String[] args) {  /** Método principal que ejecuta todas las pruebas. */

    // Test de la clase Customer
    Customer c1 = new Customer(88, "Tan Ah Teck", 10);  // Creamos un cliente de prueba con 10% descuento
    System.out.println(c1);  // Mostramos la información inicial del cliente

    c1.setDiscount(8);  // Modificamos el descuento a 8%
    System.out.println(c1);  // Mostramos la información actualizada del cliente
    System.out.println("id is: " + c1.getId());           // Mostramos el ID del cliente
    System.out.println("name is: " + c1.getName());       // Mostramos el nombre del cliente
    System.out.println("discount is: " + c1.getDiscount()); // Mostramos el nuevo descuento

    // Test de la clase Invoice
    Invoice inv1 = new Invoice(101, c1, 888.8);  // Creamos una factura para el cliente con monto inicial
    System.out.println(inv1);  // Mostramos la información completa de la factura

    inv1.setAmount(999.9);  // Modificamos el monto de la factura
    System.out.println(inv1);  // Mostramos la factura con el nuevo monto
    System.out.println("id is: " + inv1.getId());                    // Mostramos el ID de la factura
    System.out.println("customer is: " + inv1.getCustomer());        // Mostramos el objeto cliente
    System.out.println("amount is: " + inv1.getAmount());            // Mostramos el monto actualizado
    System.out.println("customer's id is: " + inv1.getCustomerId()); // Mostramos el ID del cliente vía Invoice
    System.out.println("customer's name is: " + inv1.getCustomerName());  // Mostramos el nombre vía Invoice
    System.out.println("customer's discount is: " + inv1.getCustomerDiscount());  // Mostramos el descuento vía Invoice
    System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());  // Mostramos el monto con descuento aplicado (formateado)
}
}
