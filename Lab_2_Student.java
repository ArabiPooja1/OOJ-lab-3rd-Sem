import java.util.Scanner;
class Student {
 String usn;
 String name;
 int[] credits = new int[5];
 int[] marks = new int[5];
 void acceptDetails() {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter USN: ");
 usn = scanner.nextLine();
 System.out.print("Enter Name: ");
 name = scanner.nextLine();
 System.out.println("Enter marks for 5 subjects:");
 for (int i = 0; i < 5; i++) {
 System.out.print("Subject " + (i + 1) + " credits: ");
 credits[i] = scanner.nextInt();
 System.out.print("Subject " + (i + 1) + " marks: ");
 marks[i] = scanner.nextInt();
 }
 scanner.close();
 }
 void displayDetails() {
 System.out.println("USN: " + usn);
 System.out.println("Name: " + name);
 for (int i = 0; i < 5; i++) {
 System.out.println("Subject " + (i + 1) + ": Credits=" + credits[i] 
+ ", Marks=" + marks[i]);
 }
 }
 double calculateSGPA() {
 double totalCredits = 0, totalGradePoints = 0;
 for (int i = 0; i < 5; i++) {
 totalCredits += credits[i];
 totalGradePoints += calculateGradePoint(marks[i]) * credits[i];
 }
 return totalGradePoints / totalCredits;
 }
 double calculateGradePoint(int marks) {
 if (marks >= 90) return 10;
 else if (marks >= 80) return 9;
 else if (marks >= 70) return 8;
 else if (marks >= 60) return 7;
 else if (marks >= 50) return 6;
 else if (marks >= 40) return 5;
 else return 0; // Fail
 }
}
public class Lab_2_Student {
 public static void main(String[] args) {
 Student student = new Student();
 student.acceptDetails();
 System.out.println("Details of the student:");
 student.displayDetails();
 double sgpa = student.calculateSGPA();
 System.out.println("SGPA: " + sgpa);
 }
}
