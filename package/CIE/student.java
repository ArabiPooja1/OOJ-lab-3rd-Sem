package cie;
import java.util.Scanner;
public class student{
String usn;
String name;
int semester;
public void studdetails(){
Scanner s1=new Scanner(System.in);
System.out.println("enter the usn of student");
usn=s1.next();
System.out.println("enter the name of student");
name=s1.next();
System.out.println("enter the semester of student");
semester=s1.nextInt();
}
public void printdetails(){
System.out.println("the usn of student is"+usn);
System.out.println("the name of student is"+name);
System.out.println("the semester of student is"+semester);
}
}
