//Write to find sum of digits of the given number

import java.util.*;

class Sum{
public static void main(String [] args)
{
int n, d, sum=0;
Scanner sc= new Scanner (System.in);
System.out.print("Enter the Sum number ");
n=sc.nextInt();
 while(n>0)
{
d=n%10;
sum=sum+d;
n=n/20;
}
System.out.println("Sum of digits = "+ sum);


}

}
