import java.util.Scanner;

class InvalidAgeException extends Exception {
    private int age;

    public InvalidAgeException(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
public class InvalidAge {
    public static void main(String[] args) {
        // 8. Create a custom exception InvalidAgeException that includes the invalid age value as additional data. Write a program that takes age as input and throws this exception if the age is not within the valid range (0-120).
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 0 || age > 120) {
                throw new InvalidAgeException(age);
            } else {
                System.out.println("Age is valid: " + age);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e);
        }
    }
}
