package BloqueB.CustomerAccountPackage;

public class Customer {/** creamos una clase donde introducimos los datos que vamos a meter sobre un cliente */
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) { /** definimos y pedimos esas variables */
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() { /** creamos unos metodos que nos proporcionen la posibilidad de obtener los datos las variables que hemso metido */
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() { /** creamos un string que indique el nombre del cliente junto a su id */

        return name + "(" + id + ")";
    }
}
