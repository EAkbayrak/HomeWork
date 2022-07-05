package HomeWork.Class20;

public class Task4 {

   private static void printStudentInfo(String name){
        System.out.println("Student name is "+ name);
    }

    private static void printStudentInfo(String name, String surName){
        System.out.println("Student name is "+ name + " and surname is "+surName);
    }
   private static void printStudentInfo(String name, String surName ,int age){
        System.out.println("Student name is "+ name + " and surname is "+surName+" and age is "+age);
    }
  public static void main(String[] args) {

        Task4 obj1 = new Task4();
        printStudentInfo("Emre");                               // Calling method directly
          obj1.printStudentInfo("Emre","Ak");               // calling method through an object
        Task4.printStudentInfo("Adem","Ak", 25);    // Calling method through Class name
    }}

