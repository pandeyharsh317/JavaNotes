class Employee
{
int empid; //Instance variable
String empname; //Instance variable
double salary;  //Instance variable
void setValue(int eid, String ename, double sal)
{
empid=eid;
empname=ename;
salary=sal;
}
void display()
{
System.out.println("Employee id="+empid);
System.out.println("Employee name="+empname);
System.out.println("Employee Salary"+salary);
}
}
class ClassDemo2
{
public static void main(String [] args)
{
Employee e1=new Employee();
e1.setValue(1001,"Brijesh Mishra",40000.0);
e1.display();
Employee e2=new Employee();
e2.setValue(1002,"Harsh Pandey",60000.0);
e2.display();
}
}