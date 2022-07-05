package HomeWork.Class23;

class Main{

    public static void main(String[] args) {


        Student [] institutions = {new CollegeStudent(), new SchoolStudent(),new SyntaxStudent()};


        for (Student institution:institutions){
            institution.goingToSchool();
            institution.studying();
            institution.comingHome();

            System.out.println();
        }  }
}

class Student {

    public void goingToSchool(){
        System.out.println("Going to school");
    }
    public void comingHome(){
        System.out.println("Student coming home from School");
    }
    public void studying(){
        System.out.println("Student Studying at school");
    }
}

class SyntaxStudent extends Student{

    @Override
    public void goingToSchool() {
        System.out.println("Syntax student Going to join zoom call");
    }

    @Override
    public void comingHome() {
        System.out.println("Student leaving zoom call ");
    }

    @Override
    public void studying() {
        System.out.println("Student listening to instructor on Zoom call");
    }
}

class CollegeStudent extends Student{
    @Override
    public void goingToSchool() {
        System.out.println("College student going Hackney Community college");
    }

    @Override
    public void comingHome() {
        System.out.println("Student coming home from college");
    }

    @Override
    public void studying() {
        System.out.println("Student is studying at college");
    }

    public void classStartTime(){
        System.out.println("You start at 9 AM");
    }
}

class SchoolStudent extends Student{
    @Override
    public void goingToSchool() {
        super.goingToSchool();
    }

    @Override
    public void comingHome() {
        super.comingHome();
    }

    @Override
    public void studying() {
        super.studying();
    }
}