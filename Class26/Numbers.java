package HomeWork.Class26;

import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {

    ArrayList<Integer> num = new ArrayList<>();

    for(int i = 0; i <= 500; i++) {
        num.add(i);
    }

    for(int a = 0; a<num.size(); a++){
        if(num.get(a) % 5 == 0) num.remove(a);
    }
        System.out.println(num);



    }
}
