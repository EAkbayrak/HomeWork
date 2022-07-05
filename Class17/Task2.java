package HomeWork.Class17;
/*
 Create a method that will take a String as a parameter and returns reversed String.
 Method should be available to all classes within your project and accessible by class name.
 */


public class Task2 {

  public static String name( String Name){

        StringBuilder reverseName = new StringBuilder(Name);
        reverseName = reverseName.reverse();
        Name = String.valueOf(reverseName);

        return Name;
    }
    public static void main(String[] args) {

        System.out.println(Task2.name("Emre"));
    }
}
