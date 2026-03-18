package BloqueB.CustomerAccountPackage;

/**
 * Clase principal para probar la funcionalidad de Customer y Account.
 */
public class TestMain {  /** Definimos la clase de pruebas principal. */

public static void main(String[] args) {  /** Método principal que ejecuta todas las pruebas. */

    Customer c1 = new Customer(101, "Ana Garcia", 'f');  // Creamos un cliente de prueba
    System.out.println(c1);  // Mostramos la información del cliente

    Account acc1 = new Account(8111, c1, 150.50);  // Creamos una cuenta para el cliente con saldo inicial
    System.out.println(acc1);  // Mostramos la información completa de la cuenta

    System.out.println("Customer name is: " + acc1.getCustomerName());  // Mostramos el nombre del cliente vía Account

    acc1.deposit(50.0);  // Realizamos un depósito de 50 unidades
    System.out.println("Tras ingresar 50: " + acc1);  // Mostramos el nuevo saldo

    acc1.withdraw(100.0);  // Realizamos un retiro de 100 unidades
    System.out.println("Tras retirar 100: " + acc1);  // Mostramos el saldo resultante

    acc1.withdraw(500.0);  // Intentamos un retiro mayor al saldo disponible
    System.out.println("Intento de retirar 500: " + acc1);  // Mostramos resultado (saldo sin cambios + mensaje error)
}
}
