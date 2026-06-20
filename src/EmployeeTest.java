import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
public class EmployeeTest {
    private PayrollSystem payrollSystem;
    private FulltimeEmployee fulltimeEmployee;
    private PartTimeEmployee partTimeEmployee;

    @BeforeEach
    void setup(){
        payrollSystem=new PayrollSystem();
        fulltimeEmployee=new FulltimeEmployee("Akshat",1,80000);
        partTimeEmployee=new PartTimeEmployee("Alex",2,40,1000);
    }
    @Test
    void testFullTimeEmployeeSalary(){
        assertEquals(80000, fulltimeEmployee.calculateSalary(),0.01);
    }
    @Test
    void testPartTimeEmployeeSalary(){
        assertEquals(40000, partTimeEmployee.calculateSalary(),0.01);
    }
    @Test
    void testAddRemoveEmployee(){
        payrollSystem.addEmployee(fulltimeEmployee);
        payrollSystem.addEmployee(partTimeEmployee);

        assertDoesNotThrow(()-> payrollSystem.removeEmployee(2));
        assertDoesNotThrow(()-> payrollSystem.removeEmployee(1000));

    }


}
