import java.util.ArrayList;

abstract class employee{
    private String name;
    private int id;

    public employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
         return name;
    }
    public int getId(){
        return id;
    }
    public abstract double calculateSalary();
    @Override
    public String toString(){
        return "Employee[name="+name+",id="+id+", salary="+ calculateSalary()+"]";
    }
}
class FulltimeEmployee extends employee{
    private double monthlySalary;
    public FulltimeEmployee(String name, int id, double monthlySalary){
        super(name,id);
        this.monthlySalary=monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name,int id,int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
        @Override
        public double calculateSalary() {
            return hoursWorked * hourlyRate;
        }


}
class PayrollSystem{
    private ArrayList<employee> employeeList;
    public PayrollSystem(){
        employeeList=new ArrayList<>();
    }

    public void addEmployee(employee employees){
        employeeList.add(employees);
    }

    public void removeEmployee(int id){
        employee employeeToRemove=null;
        for(employee employees: employeeList){
            if(employees.getId()==id){
                employeeToRemove=employees;
                break;
            }
        }
        if(employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
        }

    }
    public void displayEmployees(){
        for(employee employees:employeeList){
            System.out.println(employees);
        }
    }
}




public class Main{
    public static void main(String[] args){
        PayrollSystem payrollSystem=new PayrollSystem();
        FulltimeEmployee emp1= new FulltimeEmployee("Akshat",1,80000);
        PartTimeEmployee emp2=new PartTimeEmployee("Alex",2,40,1000);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Data:");
        payrollSystem.displayEmployees();
        System.out.println("Remove employee:");
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining Employees");
        payrollSystem.displayEmployees();

    }
}
