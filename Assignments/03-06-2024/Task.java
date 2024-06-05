import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        // 1. Write a java program to Append text or string in a file 
        // FileWriter f1 = new FileWriter("dehradun.txt", true);
        // BufferedWriter bw = new BufferedWriter(f1);
        // bw.write(" Sanjay Sonkariya!");
        // bw.close();
        // System.out.println("Data Appended Successfully!");

        // 2. Write a java program to Read content from file using BufferedReader
        // FileReader f1 = new  FileReader("dehradun.txt");
        // BufferedReader br = new BufferedReader(f1);
        // String content = br.readLine();
        // br.close();
        // System.out.println(content);

        // 3. Write a java program to Get the size of give file in bytes, kilobytes and megabytes
        // File f1 = new File("dehradun.txt");
        // try {
        //     if (f1.exists()) {
        //         long bytes = f1.length();
        //         double kilobytes = (bytes / 1024.00);
        //         double megabytes = (kilobytes / 1024.0);
        //         System.out.println("File size is: " + bytes + " Bytes");
        //         System.out.println("File size is: " + kilobytes + " Kilobytes");
        //         System.out.println("File size is: " + megabytes + " Megabytes");
        //     } else {
        //         System.out.println("File not found!");
        //     }   
        // } catch (Exception e) {
        //     System.out.println("Error: " + e);
        // }


        // 4. Write a java program to Delete a file 
        // File a = new File("dehradun.txt");
        // if (a.exists()) {
        //     a.delete();
        //     System.out.println("File Deleted Successfully!");
        // }
        // else {
        //     System.out.println("File not found!");
        // }

        
        // 5. Write a java program to Read a file line by line 
        // try {
        //     File f1 = new File("dehradun.txt");
        //     Scanner s1 = new Scanner(f1);
        //         while (s1.hasNextLine()) {
        //             String content = s1.nextLine();
        //             System.out.println(content);
        //     }
        // } catch (Exception e) {
        //     System.out.println("Error: " + e);
        // }


        // 7. Write a Java program that reads a file specified by the user. Use exception handling to catch any FileNotFoundException and IOException. 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter you file name (example.txt): ");
        // String fileName  = sc.nextLine();
        // try {
        //     FileReader fr = new FileReader(fileName);
        //     BufferedReader br = new BufferedReader(fr);
        //     String content = br.readLine();
        //     br.close();
        //     System.out.println(content);
        // } catch (FileNotFoundException e) {
        //     System.out.println("Error: " + e);    
        // }




    }
}
