//WAP to check number is prime or not
import java.util.*;

class Prime{
public static void main(String [] args)
{
int n,i,c=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number : ");
n=sc.nextInt();

for (i=1; i<=n; i++)
{
if(n%i==0)
{
c++;
}
}
if(c==2)
{
System.out.println("Number the prime : ");
}
else
{
System.out.println("Number the not-prime : ");
}
}
}