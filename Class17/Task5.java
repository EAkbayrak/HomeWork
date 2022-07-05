package HomeWork.Class17;
/*

Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different
students with different marks. Your program should print an average mark of each student's name.

*/

public class Task5 {
}

class Student{
    String name;
    int mathGrade;  int englishGrade; int javaGrade;

    Student (String name, int mathGrade, int englishGrade, int javaGrade){

        this.name=name;
        this.mathGrade=mathGrade;
        this.englishGrade=englishGrade;
        this.javaGrade=javaGrade;
    }
    int averageGrade=0;

    void printAverage(){
        averageGrade = (mathGrade+englishGrade+javaGrade) /3;
        System.out.println("Student name "+name+" has received the following grade mark "+ averageGrade);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Emre", 80, 70, 80);
        student1.printAverage();

        Student student2 = new Student("Jason", 90, 100, 95);
        student2.printAverage();

        Student student3 = new Student("Merve", 90, 75, 95);
        student3.printAverage();

    }


}