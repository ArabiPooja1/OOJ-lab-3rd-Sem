
package see;
import java.util.Scanner;
import cie.student;
public class external extends student{
public float seemarks[]=new float[5];
public void seemarks(){
Scanner s2=new Scanner(System.in);
System.out.println("enter the see marks of student");
for(int i=0;i<5;i++){
seemarks[i]=s2.nextFloat();
}
}
public void printseemarks(){
System.out.println("the see marks of student is");
for(int i=0;i<5;i++){
System.out.println(seemarks[i]);
}
}
}

