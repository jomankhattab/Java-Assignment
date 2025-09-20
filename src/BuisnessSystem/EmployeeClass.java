package BuisnessSystem;


abstract class EmployeeClass {
    private int id;
    private String name ;
    private double baseSalary ;
    private static int employeeCount =0;

    public EmployeeClass (int id ,String name , double baseSalary){
        this.id =id;
        this .name = name ;
        this .baseSalary = baseSalary;
        employeeCount++;
    }

    public int getID (){
        return id;
    }

    public void setId (int id){
      this.id = id ;
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name = name ;
    }

    public double getBaseSalary (){
        return baseSalary;
    }

    public void setBaseSalary (double baseSalary){
        this.baseSalary = baseSalary ;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }

// no of employess have been created:
    public  static  int getEmployeeCount(){
        return  employeeCount;
    }

}
