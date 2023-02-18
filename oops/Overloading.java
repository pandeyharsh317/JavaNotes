//WAP to demonstrate concept of method overloading 
import java.util.*;
class Figure {
int area(int s){
return s*s;
}
int area (int l,int b){
return l*b;
}
double area (double r) {
return 3.14*r*r;
}
}
class Overloading{
public static void main(String [] args) {
int s, l, b, a1, a2;
double a3, r;
Scanner sc=new Scanner(System.in);
Figure fig=new Figure();
System.out.print("Enter side of square : ");
s=sc.nextInt();
System.out.print("Enter length of rectangle : ");
l=sc.nextInt();
System.out.print("Enter breadth of rectangle : ");
b=sc.nextInt();
System.out.print("Enter radius of circle : ");
r=sc.nextDouble();
a1=fig.area(s);
a2=fig.area(l,b);
a3=fig.area(r);
System.out.println("Area of square = "+a1);
System.out.println("Area of rectangle = "+a2);
System.out.println("Area of circle = "+a3);

}
}