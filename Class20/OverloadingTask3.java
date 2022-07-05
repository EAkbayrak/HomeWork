package HomeWork.Class20;

public class OverloadingTask3 {

    // Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

     String name, surName, location; char gender; int age; double weight, height;

    static void printStudentInfo(String name){
        System.out.println("Student name is "+ name);
    }

    static void printStudentInfo(String name, String surName){
        System.out.println("Student name is "+ name + " and surname is "+surName);
    }
    static void printStudentInfo(String name, String surName ,int age){
        System.out.println("Student name is "+ name + " and surname is "+surName+" and age is "+age);
    }
    public static void main(String[] args) {

    OverloadingTask3 obj1 = new OverloadingTask3();
    OverloadingTask3.printStudentInfo("Emre");            // Calling method through Class name
    printStudentInfo("Emre","Ak");               // Calling method directly
    obj1.printStudentInfo("Adem","Ak", 25); // calling method through an object
}}

