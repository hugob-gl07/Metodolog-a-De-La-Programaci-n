package src.Ejercicios.Person;
/**
 * Probador para las clases Person, Student y Staff
 */
public class TestPerson {
    public static void main(String[] args){
        /**
         * Declara e instancia p1 con el constructor de Person.*/
        Person p1=new Person("Juan Perez", "Calle Falsa 123");
        /** Imprime p1 usando toString() */
        System.out.println(p1);
        /** Declara e instancia s1 con el constructor de Student.*/
        Student s1=new Student("Ana Gómez","Av. Siempre Viva 742", "Sistemas", 2024, 1500.0);
        /** Imprime s1 usando toString() */
        System.out.println(s1);
        /** Declara e instancia st1 con el constructor de Staff.*/
        Staff st1=new Staff("Carlos Ruiz", "Plaza Mayor 1", "UAH", 2500.0);
        /** Imprime st1 usando toString() */
        System.out.println(st1);
        /** Imprime el nombre del estudiante y el salario del miembro del personal */
        System.out.println("name'student is: " + s1.getName());
        System.out.println("pay is: " + st1.getPay());
    }
}