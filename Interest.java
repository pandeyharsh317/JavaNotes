//compound interest 
import java.util.*;
class Interest
{
public static void main(String [] args)
{
int a,p,r,n,t;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the initial principal balance ");
p=sc.nextInt();
System.out.print("Enter the interest rate ");
r=sc.nextInt();
System.out.print("Enter the number of times interest applied per time period ");
n=sc.nextInt();
System.out.print("Enter the number of time periods elapsed ");
t=sc.nextInt();
a=p*(1+r/n);
System.out.print("Compound interest : "+a);

}
}