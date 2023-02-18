//Write a program to print a table of given number
import java.util.*;
class ForLoop
{
public static void main(String[] args)
{
int n, i, t;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the fast number ");
n=sc.nextInt();

for(i=0; i<=10; i++)
{
t=n*i;
System.out.println(n+ "*" +i +" = " +t);
System.out.printf("%d*%d=%d\n",n,i,t);
}
}
}