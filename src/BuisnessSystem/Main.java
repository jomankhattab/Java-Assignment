package BuisnessSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<EmployeeClass> employees = new ArrayList<>();
//        employees.add(new Manger(1, "Ali", 5000, 1000));
//        employees.add(new SalesPerson(2, "Sara", 3000, 500));
//        employees.add(new Intern(3, "Omar", 1500));
        double totalPayRoll=0;
        Scanner scanner= new Scanner(System.in);


        while (true) {
            System.out.println("Enter the operation (or 'exit' to finish):");
            String operation = scanner.nextLine();
            if (operation.equalsIgnoreCase("exit")) {
                break;}
        System.out.println("Enter the role :");
        String role = scanner.nextLine();

        System.out.println("Enter the ID :");
        int  id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter the Name :");
        String name = scanner.nextLine();

        System.out.println("Enter the base Salary :");
        double baseSalary = scanner.nextDouble();


        if (role.equalsIgnoreCase("Manger")){
            System.out.print("Enter Bonus: ");
            double bonus = scanner.nextDouble();
            employees.add(new Manger( id , name , baseSalary ,  bonus));

        }

        if (role.equalsIgnoreCase("Intern")){
            employees.add(new Intern( id , name , baseSalary));
        }

        if (role.equalsIgnoreCase("SalesPerson")){
            System.out.print("Enter commission: ");
            double commission = scanner.nextDouble();
            employees.add(new SalesPerson( id , name , baseSalary, commission));
        }

        for (EmployeeClass emp :employees){
            emp.displayInfo();
            emp.calculateSalary();
            System.out.println("Salary=" + emp.calculateSalary());
            if (emp instanceof Manger)
                System.out.println("the Employee is manger");
            else if (emp instanceof Intern)
            System.out.println("the Employee is Intern");

            else if (emp instanceof SalesPerson)
                System.out.println("the Employee is Sales Person");

            totalPayRoll =totalPayRoll+emp.calculateSalary();
            System.out.println("Total Payroll=" + totalPayRoll);

            System.out.println("Total Employees Created=" + emp.getEmployeeCount());

            System.out.println("\nAll Employee Names:");
            for (EmployeeClass e : employees) {
                System.out.println(e.getName());
            }



        }
        }

    }
}