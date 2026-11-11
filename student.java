import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Clear the leftover newline character

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        // Displaying student details
        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Age        : " + age);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage + "%");

        sc.close();
    }
}

