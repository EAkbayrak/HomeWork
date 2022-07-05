package HomeWork.Class20;

public class Task1 {
    double height; double length; double width; double volume;
       double getVolume(double length, double width, double height){
           this.length=length;  this.height=height;
           this.width=width;

           return volume=length*width*height;}
    double getArea(double length, double width){
        this.length = length;
        this.width = width;

        return length*width;}

    double getArea(double length){
        this.length = length;

        return Math.pow(2, length);
        }
static class Rectangle extends Task1 {
    public static void main(String[] args) {
        Task1 rectangle = new Task1();

        System.out.println("The area of the rectangle is "+rectangle.getArea(5.6,5.7));

        Task1 square = new Task1 ();

        System.out.println("The area of the square is "+square.getArea(5.6));

        Task1 cube = new Task1 ();
        System.out.println("The volume of the cube is  "+cube.getVolume(5.5,5.1,7.2));

    }
}}