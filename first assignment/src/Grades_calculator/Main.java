
package Grades_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3] ;

        for (int i = 0 ; i<= students.length ;i++){
            System.out.print("Enter the name of student" + (i+1) + ":");
            String name = scanner.nextLine();
            System.out.print("Enter ID:" );
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the grade of 1st subject:" );
            double grade1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the grade of 2st subject:" );
            double grade2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the grade of 3st subject:" );
            double grade3 = scanner.nextDouble();
            scanner.nextLine();
            Student student = new Student(name , id ,grade1 , grade2 , grade3);
            student.displayInfo();
            System.out.println("---------------");
        }
        // for (Student s : students) {
        //     s.displayInfo();
        // }
      scanner.close();
        }
    }
