//Write a program to demonstrate concept of Inheritance
class A 
{
void showA(){
System.out.println("This message from class A");
}
}
class B extends A {
void showB(){
System.out.println("This message from class B");
}
}
class InDemo1
{
public static void main(String [] args)
{
B b=new B();
b.showA();
b.showB();
}
}