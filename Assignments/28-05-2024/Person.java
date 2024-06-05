import java.util.Scanner;
// public class Person {
//     Scanner a = new Scanner(System.in);
//     String name = a.nextLine();
//     int age = a.nextInt();

//     public static void main(String[] args) {
//         System.out.println("Enter your name and age: ");
//         Person objPerson = new Person();

//         System.out.println("Good Evening " + objPerson.name + " Sir/Madam, " + "Your age is " + objPerson.age + ".");
//     }
// }


public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Person objPerson = new Person();
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your name: ");
        objPerson.name = a.nextLine();
        System.out.print("Enter your age: ");
        objPerson.age = a.nextInt();



        System.out.println("Good Evening " + objPerson.name + " Sir/Madam, " + "Your age is " + objPerson.age + ".");
    }
}
