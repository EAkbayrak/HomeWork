package HomeWork.Class18;

public class Task3MathTeacher extends Task3Teacher{
    String name;
    String subject;
    public int classRoomYear;
    int age;

    public static void main(String[] args) {
        Task3Teacher teach2 = new Task3Teacher();

        Task3Teacher.subject="Java";
        Task3Teacher teach12 = new Task3Teacher();


        teach2.classRoomYear=2022;
        teach2.subject="Java";
        teach2.age=15;
        teach2.printInfo("Emre","Java", 2022, 27);





    }

}
