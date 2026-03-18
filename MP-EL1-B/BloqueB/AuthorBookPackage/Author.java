package BloqueB.AuthorBookPackage;

public class Author { /** creamos una clase donde pediremos tanto el nombre como el correo del autor, por eso las variables privadas */
    private String name;
    private String email;

    public Author(String name, String email) { /** indicamos que estos son lso datos a usar */
        this.name = name;
        this.email = email;
    }

    public String getName() { /** pedimos el nombre */
        return name;
    }

    public String getEmail() { /** pedimos el correo dos veces como si fuese una autentificacion */
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() { /** creamos un string el cual nos devuelva un texto con su nombre y apellido */
        return "Author[name=" + name + ",email=" + email + "]";
    }
}
