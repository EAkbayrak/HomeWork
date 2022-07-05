package HomeWork.Class16;

public class SyntaxEmployee {
    // task 1
//Create three  variables  empID , salary and set the CEO to “Sumair”

    int empID;
    int salary;

    static String CEO="Sumair";


    public static void main(String[] args) {
       SyntaxEmployee emp1 =  new SyntaxEmployee();
       emp1.empID=152;
       emp1.salary=69000;

       SyntaxEmployee emp2 = new SyntaxEmployee();
       emp2.salary=70000;
       emp2.empID=166;

       SyntaxEmployee emp3 = new SyntaxEmployee();
       emp3.salary=71000;
       emp3.empID=551;

        System.out.println(emp1.CEO+"'s employee number is "+emp1.empID+" and has a net salary of "+emp1.salary);
        System.out.println(emp2.CEO+"'s employee number is "+emp2.empID+" and has a net salary of "+emp2.salary);
        System.out.println(emp3.CEO+"'s employee number is "+emp3.empID+" and has a net salary of "+emp3.salary);

    }




}