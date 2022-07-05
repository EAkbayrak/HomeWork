package HomeWork.Class25;

public class main {

    public static void main(String[] args) {

    Shape [] shapes = {new Circle(), new Square()};

    for(Shape sh:shapes){
        sh.calculateArea();
        sh.calculatePerimiter();
    }


    }
}
