package HomeWork.Class26;

import java.rmi.Remote;
import java.util.ArrayList;

public class Letters {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Emre");
        names.add("Turkiye");
        names.add("John");
        names.add("Ramie");
        names.add("Lol");

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).endsWith("e")){
                names.remove(names.get(i));
                i--;
            }

        }
        System.out.println(names);


    }
}
