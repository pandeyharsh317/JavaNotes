// Replace
import java.util.*;
class Replace
{
public static void main(String [] args)
{
String sen , fw, rw;
Scanner sc=new Scanner (System.in);
System.out.print("Enter a sentence : ");
sen=sc.nextLine();
System.out.print("Find what ? ");
fw=sc.nextLine();
System.out.print("Replace with : ");
rw=sc.nextLine();
System.out.println("Modified Sentence ="+sen.replace(fw,rw));
}
} 