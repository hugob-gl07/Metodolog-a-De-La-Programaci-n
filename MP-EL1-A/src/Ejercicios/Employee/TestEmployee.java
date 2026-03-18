package src.Ejercicios.Employee;
/**
 * Probador para la clase Employee
 */
public class TestEmployee {
    public static void main(String[] args) {
    /** Declara e instancia e1 con el constructor completo. */
        Employee e1= new Employee(8, "Peter","Tan",2500);
    /** Imprime e1 usando toString()
        System.out.println(e1);
    /** Modifica el salario de e1 a 999 */
        e1.setSalary(999);
    /** Imprime e1 con el nuevo salario */
        System.out.println(e1);
    /** Imprime cada atributo de e1*/
        System.out.println("id is: " +e1.getId());
        System.out.println("firstname is: " +e1.getFirstName());
        System.out.println(("lastname is: "+ e1.getLastName()));
        System.out.println("salary is: "+ e1.getSalary());
        System.out.println("name is: "+ e1.getName());
    /** Imprime el salario anual de e1 */
        System.out.println("annual salary: "+ e1.getAnnualSalary());
    /** Aumenta el salario de e1 un 10% e imprime el nuevo salario */
        System.out.println(e1.raiseSalary(10));
    /** Imprime e1 con el salario actualizado */
        System.out.println(e1);
    }
}
