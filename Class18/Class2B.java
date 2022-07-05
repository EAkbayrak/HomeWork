package HomeWork.Class18;

public class Class2B extends Class2A{

    public static void main(String[] args) {
        printF("Merve"); // calling method directly

        Class2A.printF("Gennadiy"); //calling method through the Class name

        Class2A student1 = new Class2A (); // Creating an object

        student1.printF("Jason"); // calling the method via the object above


    }
}
