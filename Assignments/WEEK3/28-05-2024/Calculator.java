import java.util.Scanner;
public class Calculator {
    float num1;
    float num2;
    String x;
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Calculator objCalculator = new Calculator();
        System.out.print("Choose your action (Addition[+], Subtraction[-], Multiplication[*], Division[/]): ");
        objCalculator.x = a.nextLine();

        switch (objCalculator.x) {
            case "+": 
                System.out.print("enter your first number: ");
                objCalculator.num1 = a.nextFloat();
                System.out.print("enter your second number: ");
                objCalculator.num2 = a.nextFloat();
                System.out.println("Your Addition is: " + (objCalculator.num1+objCalculator.num2));                 
                break;
            case "-":
                System.out.print("enter your first number: ");
                objCalculator.num1 = a.nextFloat();
                System.out.print("enter your second number: ");
                objCalculator.num2 = a.nextFloat();
                System.out.println("Your Subtraction is: " + (objCalculator.num1-objCalculator.num2));
                break;
            case "*":
                System.out.print("enter your first number: ");
                objCalculator.num1 = a.nextFloat();
                System.out.print("enter your second number: ");
                objCalculator.num2 = a.nextFloat();
                System.out.println("Your Multiplication is: " + (objCalculator.num1*objCalculator.num2));
                break;
            case "/":
                System.out.print("enter your first number: ");
                objCalculator.num1 = a.nextFloat();
                System.out.print("enter your second number:");
                objCalculator.num2 = a.nextFloat();
                if(objCalculator.num2 == 0) {
                    System.out.println("Your Division is: Cannot divide by zero");
                }
                else{
                    System.out.println("Your Division is: " + (objCalculator.num1/objCalculator.num2));
                }
                break;
            default:
                System.out.println("Invalid Action");
                break;
        }
    }
}
