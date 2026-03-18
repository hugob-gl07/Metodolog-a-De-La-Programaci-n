package BloqueB.CustomerAccountPackage;

public class TestMain {
    public static void main(String[] args) {

        Customer c1 = new Customer(101, "Ana Garcia", 'f');
        System.out.println(c1);

        Account acc1 = new Account(8111, c1, 150.50);
        System.out.println(acc1);

        System.out.println("Customer name is: " + acc1.getCustomerName());

        acc1.deposit(50.0);
        System.out.println("Tras ingresar 50: " + acc1);

        acc1.withdraw(100.0);
        System.out.println("Tras retirar 100: " + acc1);

        acc1.withdraw(500.0);
        System.out.println("Intento de retirar 500: " + acc1);
    }
}
