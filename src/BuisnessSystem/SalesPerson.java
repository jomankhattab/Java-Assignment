package BuisnessSystem;

public class SalesPerson extends EmployeeClass {

    private  double commission ;

    public SalesPerson (int id ,String name ,double baseSalary , double commission){
        super(id, name, baseSalary);
        this .commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission() {
        this.commission = commission;
    }

    @Override
    public  double calculateSalary(){
        return getBaseSalary() + getCommission();
    }
}
