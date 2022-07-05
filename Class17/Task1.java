package HomeWork.Class17;

public class Task1 {

    // Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.

    static int sum=0;
    static int arraySum(int[] arr){

        for(int i = 0; i < arr.length; i++ ){
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {5,6,7,8,5,2};
        System.out.println(Task1.arraySum(arr));

    }



}
