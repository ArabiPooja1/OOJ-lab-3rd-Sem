import java.util.Scanner;
class First{
public static void main(String args[]){
int a,b,c;
double r1,r2,d;
System.out.println("enter the coefficients of quadratic equation");
Scanner s1= new Scanner(System.in);
a=s1.nextInt();
b=s1.nextInt();
c=s1.nextInt();
if(a==0){
System.out.println("coefficients are invalid");
}
else{
d=b*b-(4*a*c);
if(d>0){
System.out.println("it has real and distinct roots");
r1=((-b+Math.sqrt(d)))/(2*a);
r2=((-b-Math.sqrt(d)))/(2*a);
System.out.println("the roots are "+r1+" and "+r2);
}
else if(d==0){
System.out.println("it has real and equal roots");
r1=(-b)/(2*a);
System.out.println("the roots are "+r1+" and "+r1);
}
else{
System.out.println("it has no real roots");
}
}
}
}
Output:
