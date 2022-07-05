package HomeWork.Class24;

/*
Create a class File that will have the following behaviors:
open, edit, close. Edit and close are implemented method while open is an abstract.
 Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
  Example: to open .java file we need notepad++ or sublime text, to open .doc file
  we need Microsoft Word to be installed etc
 */

public abstract class Task1 {

    abstract void open();

    void edit() {
        System.out.println("Edit JavaFiles online ");
    }

    void close() {
        System.out.println("Close JavaFiles");
    }

}

// Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    class JavaFile extends Task1 {

    @Override
    void open() {
        System.out.println("Open JavaFiles");
    }


}
    class WordFile extends Task1{

        @Override
        void open() {
            System.out.println("Open WordFile");
        }

        @Override
        void edit() {
            System.out.println("Edit WordFile online ");
        }

        @Override
        void close() {
            System.out.println("Close WordFile");
        }
    }

    class PdfFile extends Task1{
        @Override
        void open() {
            System.out.println("Open PdfFile");
        }

        @Override
        void edit() {
            System.out.println("Edit PdfFile online ");
        }

        @Override
        void close() {
            System.out.println("Close PdfFile");
        }

    }

class Task1Tester{

    public static void main(String[] args) {

    Task1 [] arr = {new JavaFile(), new PdfFile(), new WordFile()};

    for(Task1 t:arr){
        t.open();
        t.edit();
        t.close();
        System.out.println("----------------");
    }
    }
}