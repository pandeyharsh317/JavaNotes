//Wap to check given String is pallindrome or not
import java.util.*;
class StringPallindrome
{
public static void main(String [] args)
{
String str, revstr="";
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string : ");
str=sc.nextLine();
for(int i=str.length()-1; i>=0; i--)
{
revstr=revstr+str.charAt(i);
}
if(str.equalsIgnoreCase(revstr)==true)
{
System.out.println("String is Pallindrome : ");
}
else
{
System.out.println("String is not Pallindrome : ");
}


}
}