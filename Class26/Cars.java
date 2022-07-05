package HomeWork.Class26;

import java.util.ArrayList;

public class Cars {
    /*
    Create an arraylist of cars and retrieve all the values using 3 different ways.
     */

    public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<>();

    cars.add("Nissan");
    cars.add("Toyota");
    cars.add("BMW");

    // 1ST way of retrieving all the values is
        System.out.println(cars);

    // 2nd way of retrieving all the values is
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    // 3rd way of retrieving all the values is
        for(String c:cars){
            System.out.println(c);
        }
    }
}
