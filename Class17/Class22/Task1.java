package HomeWork.Class17.Class22;

public class Task1 {
    public static void main(String[] args) {
    Masters student1 = new Masters ();
    Bachelors student2 = new Bachelors ();
    Degree student3 = new Degree ();

        student1.getPrerequisite();
        student2.getPrerequisite();
        student3.getPrerequisite();
    }}
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need a high school diploma");
    }}
class Bachelors extends Degree{
}
class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Masters you need a Bachelors diploma");
    }
}