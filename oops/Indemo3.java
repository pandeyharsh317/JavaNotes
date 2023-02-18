//WAP to demonstrate Multi-level Inheritance
class X {
void showX(){
System.out.println("Message from class X");
}
}
class Y extends X {
void showY(){
System.out.println("Message from class Y");
}
}
class Z extends Y {
void showZ(){
System.out.println("Message from class Z");
}
}
class InDemo3{
public static void main(String [] args){
Z z=new Z();
z.showX();
z.showY();
z.showZ();
}
}