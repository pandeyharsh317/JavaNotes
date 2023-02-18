import java.util.*;

class Equ
{
public static void main(String [] args )
{
String str1,str2;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number");
str1=sc.nextLine();
System.out.println("Enter the second number");
str2=sc.nextLine();
if(str1.equals(str2)==true)
{
System.out.println("Both String equals");
}else
{
System.out.println("Both are not equlas");
}
}
}