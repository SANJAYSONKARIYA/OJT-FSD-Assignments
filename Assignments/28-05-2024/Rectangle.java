import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter the rectangle length: ");
        int length = a.nextInt();
        System.out.print("enter the rectangle width: ");
        int width = a.nextInt();

        System.out.println("Area of Rectangle = " + length*width);
    }
    
}
