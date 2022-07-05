package HomeWork.Class26;

import java.util.ArrayList;

public class Drinks {
    public static void main(String[] args) {
        ArrayList <String> drinks = new ArrayList<>();

        drinks.add("Pepsi");
        drinks.add("RedBull");
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Apple Juice");



        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.remove(i);
                drinks.add(i, "Water");
            }}

        System.out.println(drinks);







}}
