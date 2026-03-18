package src.Ejercicios.Account;

/**
 * Represnta una cuenta bancaria con id, nombre y saldo
 */
public class Account {

    private String id;
    private String name;
    private int balance;
/**Constructor sin saldo inicial */
    public Account(String id, String name){

        this.id=id;
        this.name=name;

    }
/**Constructor con saldo incial*/
    public Account(String id, String name, int balance){

        this.id=id;
        this.name=name;
        this.balance=balance;
    }
/**Devuelve el identificador de la cuenta */
    public String getId(){

        return id;
    }
/**Devuelve el nombre del titular*/
    public String getName(){

        return name;
    }
/**Devuelve el saldo actual*/
    public int getBalance(){

        return balance;
    }
/** Ingresa una cantidad al saldo*/
    public int credit(int amount){
        this.balance+= amount;
        return this.balance;
    }
/**
 * Retira una cantidad del saldo
 * Si la cantidad supera al saldo imprime un aviso y no realiza la operación
 */
    public int debit( int amount){

        if (amount<=balance){
            balance-=amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    /**
     * Transfiere una cantidad a otra cuenta
     * Si la cantidad supera el saldo imprime un aviso y no realiza la operación
     */
    public int transferTo(Account another, int amount){

        if (amount<=balance){
            this.balance-=amount;
            another.credit(amount);
        }

        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;

    }
/** Devuelve una representación en texto de la cuenta*/
    public String toString(){

        return "Account.Account[id=" + id +",name=" + name +",balance=" + balance +"]";
    }
}
