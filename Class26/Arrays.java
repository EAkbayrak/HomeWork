package HomeWork.Class26;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        /*
        Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
         */

    ArrayList<String> names = new ArrayList<>();

    names.add("Emre");
    names.add("Zameer");
    names.add("Adem");
    names.add("Rami");
    names.add("Duran");

        // Find out whether the given ArrayList is empty or not?
        System.out.println("The array is empty = "+names.isEmpty());

        // Check whether the specific name is present in an ArrayList or not?
        System.out.println("The array contains Emre in it, that's " + names.contains("Emre"));

        // Find the size of your arrayList and print all values from that
        System.out.println("The number of elements in this array is " + names.size());

    }
}
