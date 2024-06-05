import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int radius = a.nextInt();
        System.out.println("Area of circle = " + Math.PI*radius*radius);
    }    
}
