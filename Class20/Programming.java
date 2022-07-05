package HomeWork.Class20;

public class Programming {

    String language ="Java";

    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String language){
        this.language = language;
        System.out.println("I love "+ language);
    }

    public static void main(String[] args) {

    Programming student1 = new Programming();
    Programming student2 = new Programming("Java");
}
}
