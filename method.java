//WAP to find the sum of two numbers using user-defined method
import java.util.*;
class method
{

// Here you can create a method

static int add(int x, int y)
{
return(x+y);
}
public static void main(String [] args)
{
int a,b,c;
Scanner sc=new Scanner (System.in);
System.out.print("Enter the first number : ");
a=sc.nextInt();
System.out.print("Enter the second number : ");
b=sc.nextInt();
c=add(a,b);
System.out.println("Sum : "+c);

}
}