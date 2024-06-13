public class Task {
    public static void main(String[] args) {
        // Task1 - WAP to Swap Two Numbers in java.
        int a = 5;
        int b = 10;
        int x = a;
        a = b;
        b = x;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Output = a = 10, b = 5


        // Task2 - WAP to convert integer numbers and binary numbers in java.
        String binary = "11001";
        int decimal = Integer.parseInt(binary,2);
        System.out.println("Decimal of " + binary + " is: " + decimal);

        int decimal1 = 25;
        String binary1 = Integer.toBinaryString(decimal1);
        System.out.println("Binary of " + decimal1 + " is: " + binary1);

        // Output = Decimal of 11001 is: 25, Binary of 25 is: 11001


        // Task3 - WAP to find Factorial of a number in Java.
        int num = 5;
        int fact = 1;
        for (int i = 1; i<=num; ++i){
            
            fact *= i;
        }
        System.out.println("Factorial of " + num + " = " + fact);

        // Output = Factorial of 5 = 120


        // Task4 - WAP to add two complex number in java.
        int realNum1 = 5, imaginaryNum1 = 9;
        int realNum2 = 6, imaginaryNum2 = 8;
        int realValue = realNum1+realNum2;
        int imaginaryValue = imaginaryNum1+imaginaryNum2;
        System.out.println("Result of adding two complex number: " + realValue + "+" + imaginaryValue + "i");

        // Output = Result of adding two complex number: 11+17i
    

        // Task5 - WAP to calculate simple interest in java.
        int principal = 10000;
        int rate = 25;
        int time = 2;
        int simpleInterest = (principal*rate*time)/100;
        System.out.println("Simple Interest: " + simpleInterest + " Rs.");
        
        // Output = Simple Interest: 5000 Rs. 

        
    }
}
