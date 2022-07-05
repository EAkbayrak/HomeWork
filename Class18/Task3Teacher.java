package HomeWork.Class18;

public class Task3Teacher {
    private static String name; //static variable
    static String subject; // static instance variable
    public int classRoomYear; //public instance variable
    int age;


    void printNameOfTeacher(){
        System.out.println("The name of the teacher is " + name);
    }

   void printInfo(String name, String subject, int classRoomYear, int age){
        this.name = name;
        this.subject = subject;
        this.classRoomYear = classRoomYear;
        this.age = age;

        System.out.println("The name of the teacher is " + name +" and the subject is "+ subject );
    }

}
