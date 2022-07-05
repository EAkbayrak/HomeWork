package HomeWork.Class16;

public class Students {

    String name;
    int id;
    static int numOfStudents = 0;
   public Students() {
       numOfStudents++;
   }
    public static void main(String[] args) {
        Students std1 = new Students();
        Students std2 = new Students();
        Students std3 = new Students();

        std1.name = "Emre"; std2.name ="Adem"; std3.name="Duran";
        std1.id = 552; std2.id = 553; std3.id = 554;

        System.out.println("The number of students are "+numOfStudents);



    }
}
