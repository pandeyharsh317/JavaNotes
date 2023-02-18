import java.util.*;
class p1{
public static void main(String [] args)
{
int f=1,n;
Scanner sc=new Scanner (System.in);
System.out.print("How many terms check you ");
n=sc.nextInt();
while(n>0)
{
f=f*n;
n--;

}
System.out.println("  " +f);
}
}