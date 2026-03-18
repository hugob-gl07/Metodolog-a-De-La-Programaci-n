package src.Ejercicios.Account;
/**
 * Probador para la clase Account
 */
public class TestAccount {
    public static void main(String[] args) {
        /** Declara e instancia a1 con el constructor completo */
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        /** Imprime a1 usando toString()*/
        System.out.println(a1);
        /** Declara e instancia a2 con el constructor completo */
        Account a2= new Account("A102","Kumar", 0);
        /** Imprime a2 usando toString()*/
        System.out.println(a2);
        /** Imprime el id de a1*/
        System.out.println("ID: "+ a1.getId());
        /**Imprime el nombre de a1*/
        System.out.println("Name: "+ a1.getName());
        /**Imprime el saldo de a1 */
        System.out.println("Balance: "+ a1.getBalance());
        /** Ingresa 100 al saldo de a1 */
        a1.credit(100);
        /** Imprime a1 con el nuevo saldo */
        System.out.println(a1);
        /** Retira 50 ddel saldo de a1 */
        a1.debit((50));
        /** Imprime a1 con el nuevo saldo */
        System.out.println(a1);
        /** Intenta retirar 500, supera el saldo e imprime el aviso */
        a1.debit(500);
        /** Imprime a1, el saldo no cambia */
        System.out.println(a1);
        /** Transfiere 100 de a1 a a2 */
        a1.transferTo(a2,100);
        /** Imprime a1 con el saldo reducido*/
        System.out.println(a1);
        /** Imprime a2 con el saldo aumentado*/
        System.out.println(a2);
    }

}
