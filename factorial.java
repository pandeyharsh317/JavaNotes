// Write a program to find the factorial of a given number.
import java.util.*;

class factorial{

public static void main(String[] args){

int n, f=1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number to find factorial : ");
n=sc.nextInt();
while (n>0)
{
f=f*n;
n--;
}
System.out.println("Factorial : "+f);

}
}