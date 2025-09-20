package BuisnessSystem;

public class Intern extends EmployeeClass {
    public Intern (int id , String name ,double baseSalary){
        super(id, name, baseSalary);
    }
    @Override
    public  double calculateSalary(){
        return 3000;
    }
}
