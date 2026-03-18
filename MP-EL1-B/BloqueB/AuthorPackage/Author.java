package BloqueB.AuthorPackage;

public class Author { /** al igual que en la anterior clase author se pediran los datos de un autor y dichos datos seran las variables que estan en privado */
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) { /** le damos el valor a las variables */
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { /** creamos los metodos para poder obtener despues las variables */
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() { /** creamos un string donde se den los datos del autor y, dentro de este string, esten las demas variables*/
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}
