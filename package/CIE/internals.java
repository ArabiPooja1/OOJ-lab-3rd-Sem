package cie;
import java.util.Scanner;
public class internals extends student{
public float studmarks[]=new float[5];
public void studmarks(){
Scanner s1=new Scanner(System.in);
System.out.println("enter the internal marks of student");
for(int i=0;i<5;i++){
studmarks[i]=s1.nextFloat();
}    
}
public void printmarks(){
System.out.println("the marks of student is");
for(int i=0;i<5;i++){
System.out.println(studmarks[i]);
}
}
}
