class Student
{
int rollno;
String name;
double fee;
Student(int rno, String nm, double f) //constructor
{
rollno =rno;
name=nm;
fee=f;
}
void display()
{
System.out.println("Roll no = "+rollno);
System.out.println("Name = "+name);
System.out.println("Fee = "+fee);
}
}
class ClassDemo3
{
public static void main(String [] args)
{
Student s=new Student(1001,"Harsh",10000.00);
s.display();
}
}