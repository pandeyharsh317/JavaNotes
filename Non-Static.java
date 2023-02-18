import java.util.*;
class NonStatic
{
int volumeTiwariDilMayBasateHo(int l, int b, int h )
{
return(l*b*h);
}
public static void main(String [] args)
{
int x,y,z,v;
Scanner sc=new Scanner (System.in);
System.out.print("Enterlength of cuboid : ");
x=sc.nextInt();
System.out.print("Enter breadth of cuboid : ");
y=sc.nextInt();
System.out.print("Enter height of cuboid : ");
z=sc.nextInt();

NonStatic p=new NonStatic();

v=p.volumeTiwariDilMayBasateHo(x,y,z);
System.out.println("Volume of cuboid : "+v);
}
}