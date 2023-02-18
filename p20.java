//write a program to compare two strings for equlity
import java.util.*;
class p20
{
public static void main (String [] args )
{
String str1, str2;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number : ");
str1=sc.nextLine();
System.out.print("Enter the Second number : ");
str2=sc.nextLine();
if(str1.equalsIgnoreCase(str2))
{
System.out.println("Both String are equals");
}else{
System.out.println("Both String are not equals");
}
}
}