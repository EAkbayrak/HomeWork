package HomeWork.Class18;

 class Task3PianoTeacher extends Task3Teacher{
    public static void main(String[] args) {
        //Calling the methods & variables through the class name

  //    Task3Teacher.name="Emre";            This will not work because the variable name is private
 //     Task3Teacher.classRoomYear = 2020;   This will not work because the classRoomYear variable is instance but not static
        Task3Teacher.subject="Geography"; // This works because the variable subject is instance and static
  //    Task3Teacher.age=15;                 This will not work because age variable is just an instance
 //     Task3Teacher.printInfo("Emre", "maths", 2022, 27);  Non-static method 'printInfo

        // Calling methods & variables through an object
        Task3Teacher teach1 = new Task3Teacher();

 //     teach1.name="Merve";        name is private and static
        teach1.classRoomYear=2022;  // ClassRoomYear is public and an instance variable
        teach1.subject="Java";      // Subject is a static and instance variable
        teach1.age=15;
        teach1.printNameOfTeacher();
        teach1.printInfo("Merve", "Java", 2011, 27); //it prints name even though name is private

        //calling the method and variable directly
 //     name="Emre";
 //     classRoomYear=5;
        subject="ewfwe";
 //     age=15;
 //     printInfo("Merve", "Java", 2011, 27);



    }

}
