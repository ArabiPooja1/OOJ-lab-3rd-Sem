import java.util.Scanner;
import cie.student;
import cie.internals;
import see.external;
class main{
public static void main(String xx[]){
int n;
Scanner s3=new Scanner(System.in);
System.out.println("enter the number of students");
n=s3.nextInt();
internals internalmarks[]=new internals[n];
external externalmarks[]=new external[n];
for(int i=0;i<n;i++){
internalmarks[i]=new internals();
externalmarks[i]=new external();
internalmarks[i].studdetails();
internalmarks[i].studmarks();
externalmarks[i].seemarks();
}
float finalmarks[][]=new float[n][5];
for(int i=0;i<n;i++){
for(int j=0;j<5;j++){
finalmarks[i][j]=internalmarks[i].studmarks[j]+((externalmarks[i].seemarks[j])/2);
}
}
for(int i=0;i<n;i++){
internalmarks[i].printdetails();
internalmarks[i].printmarks();
externalmarks[i].printseemarks();
}
for(int i=0;i<n;i++){
System.out.println("the final marks of "+i+" student is");
for(int j=0;j<5;j++){
System.out.println(finalmarks[i][j]);
}
}
}
}
