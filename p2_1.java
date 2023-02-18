import java.util.*;

class Calculator
{
public static void main(String [] args)
{
int a, b;
int c;
Scanner sc=new Scanner (System.in);

System.out.print("Enter the number ");
a=sc.nextInt();
System.out.print("Enter the number ");
b=sc.nextInt();
c=a+b;

System.out.println("Sum "+ c);

}
}