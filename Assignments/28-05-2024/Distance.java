import java.util.Scanner;
public class Distance {
    int x1;
    int x2;
    int y1;
    int y2;
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Distance objDistance = new Distance();

        System.out.print("enter your x1 value: ");
        objDistance.x1 = a.nextInt();

        System.out.print("enter your x2 value: ");
        objDistance.x2 = a.nextInt();

        int block1 = (objDistance.x2-objDistance.x1)*(objDistance.x2-objDistance.x1);

        System.out.print("enter your y1 value: ");
        objDistance.y1 = a.nextInt();

        System.out.print("enter your y2 value: ");
        objDistance.y2 = a.nextInt();

        int block2 = (objDistance.y2-objDistance.y1)*(objDistance.y2-objDistance.y1);

        System.out.println("Your Distance is: " + (Math.sqrt(block1+block2)));
    }
}
