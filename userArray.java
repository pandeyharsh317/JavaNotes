// how take array form user
// Write a progaram to take 10 numbers as input. store these number in array and findsum and average.
import java.util.*;
class Arrays
{
public static void main(String[] args)
{
int[] list= new int[10];
int i,sum=0;
double avg;
Scanner sc=new Scanner(System.in);
System.out.println("Enter ten number to the list");
for (i=0; i<10; i++)
{
list[i]=sc.nextInt();
sum=sum+list[i];
}
avg=(float)sum/10;
System.out.println("Total array list : "+sum);
System.out.println("Total array list : "+avg);

}
}