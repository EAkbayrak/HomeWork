package HomeWork.Class17;

/*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
 */
public class Task3 {
      private String str(String a){
        a=a.replaceAll("[^auyoeu]", "");
        return a;
    }

    public static void main(String[] args) {
        Task3 vowels = new Task3();

        System.out.println(vowels.str("Emre"));
    }

}
