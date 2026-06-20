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
    private ArrayList<Employee> employeeList;
    public PayrollSystem(){
        employeeList=new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
}




public class Main{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
