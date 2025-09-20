package BuisnessSystem;

class Manger extends EmployeeClass {
    private double bonus ;


    public  Manger(int id ,String name ,double baseSalary,double bonus ){
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

     public double getBonus() { return bonus; }
     public void setBonus(double bonus) { this.bonus = bonus; }

 @Override
     public double calculateSalary(){
       double TotalSalary = getBaseSalary() +getBonus();
       return  TotalSalary;
 }

 }
