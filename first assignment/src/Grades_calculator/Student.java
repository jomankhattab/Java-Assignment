package Grades_calculator;

public class Student {
   String  name;
   int  id;
   double  grade1 ,grade2 ,grade3;


    public Student(String  name, int  id, double  grade1 , double grade2 ,double grade3){
        this .name = name ;
        this . id = id ;
        this . grade1 = grade1 ;
        this . grade2 = grade2 ;
        this . grade3 = grade3 ;

    }
   public double calculateAverage (){
       return (grade1 + grade2 + grade3)/3;
   }

   public boolean is_Passed (){
       return calculateAverage() >= 50;
   }

   public void displayInfo (){
       System.out.println("------ Student Report -----");
       System.out.println("Name :"  + name);
       System.out.println("ID :"  + id);
       System.out.println("Average  :"  + calculateAverage());
       if (is_Passed()){
       System.out.println("Result  :"  + "passed");
       }
       else  System.out.println("Result  :"  + "failed");
   }



}
