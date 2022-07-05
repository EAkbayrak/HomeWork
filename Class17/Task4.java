package HomeWork.Class17;

//Write a java class that will have a constructor: one with parameters and second without any parameters.
// Create a separate Test class where you will execute both of the constructors 1 by 1.

public class Task4 {
    Task4() {
        System.out.println("Thank you for entering ");
    }

    Task4 (String greeting, int a){
        for(int i=0; i<a; i++){
            System.out.println( greeting+" Java");
        }
    }


}
