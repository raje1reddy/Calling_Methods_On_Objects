
import static org.junit.Assert.*;


public class EmployeeTest {
    public static void main(String args[]) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        // emp1.name = "padmaja";
        emp1.setName("Rajendra Reddy"); //passing literal value as method parameter
        String anotherVal = "padmaja";
        emp2.setName(anotherVal);     //passing variable as method parameter
        emp1.printEmp();
        emp2.printEmp();

    }

}

