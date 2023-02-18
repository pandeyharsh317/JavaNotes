//Write a program to print the Fibonacci series up to n terms...

import java.util.*;
class Feb
{
public static void main(String[] args)
{
int n1=0,n2=1,n3,n,i;
Scanner sc=new Scanner(System.in);
System.out.print("How many term you want in series : ");
n=sc.nextInt();
System.out.print(n1+" "+n2+" ");

for(i=1; i<=n-2; i++)
{
n3=n1+n2;
System.out.print(n3+" ");
n1=n2;
n2=n3;

}

}
}