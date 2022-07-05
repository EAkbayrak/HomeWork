package HomeWork.Class25;
/*
We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B.

three subjects by student A
four subjects by student B

Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.

Provide implementation of abstract method in classes 'A' and 'B'.

The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects

as its parameters for student B. Test your code

 */

class Mains{
    public static void main(String[] args) {

        A a = new A(25, 65, 100);
        System.out.println("A's average mark is "+a.getAverage());

        B b = new B(30,75,100,99);

        System.out.println("B's average mark is "+b.getAverage());

    }
}

 abstract class Marks {

    abstract int getAverage();

}

class A extends Marks{

    int mathsMarks; int englishMarks; int javaMarks;

    A(int mathsMarks, int englishMarks, int javaMarks){
        this.englishMarks = englishMarks;
        this.javaMarks = javaMarks;
        this.mathsMarks = mathsMarks;
    }

    @Override
    int getAverage() {
        return (mathsMarks+englishMarks+javaMarks)/3;
    }
}

class B extends Marks{

    int mathsMarks; int englishMarks; int javaMarks; int seleniumMarks;

    B(int mathsMarks, int englishMarks, int javaMarks,int seleniumMarks){
        this.englishMarks = englishMarks;
        this.javaMarks = javaMarks;
        this.mathsMarks = mathsMarks;
        this.seleniumMarks=seleniumMarks;
    }

    @Override
    int getAverage() {
        return (mathsMarks+englishMarks+javaMarks+seleniumMarks)/3;
    }
}
