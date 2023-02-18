//Word Counter 
import java.util.*;
class Split
{
public static void main(String [] args)
{
String sen;
Scanner sc=new Scanner (System.in);
System.out.print("Enter a sentence : ");
sen=sc.nextLine();
String [] words=sen.split(" ");
int l=words.length;
System.out.println("no of words ="+l);
}
}