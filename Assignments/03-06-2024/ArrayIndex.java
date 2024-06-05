import java.util.Scanner;
public class ArrayIndex {
    public static void main(String[] args) {
        // 6. Write a Java program that initializes an array of integers and prompts the user to enter an index to access. Use exception handling to catch any ArrayIndexOutOfBoundsException. 
        int[] arrayData = {10,20,30,40,50,60};
        Scanner s1 = new Scanner(System.in);
        System.out.print("enter the index number of array: ");
        try {
            int indexNum = s1.nextInt();
            int result = arrayData[indexNum];
            System.out.println("The value of the index is " + indexNum + ": " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
