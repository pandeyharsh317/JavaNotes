//Wap to demonstrate concept of method Overriding
class Base {
void m1() {
System.out.println("M1 of base");
}
void m2() {
System.out.println("M2 of base");
}
}
class Derived extends Base {
void m1() {
System.out.println("m1 of derived ");
}
void m3() {
System.out.println("m3 of derived ");
}
}
class Overriding {
public static void main(String [] args){
Base b=new Base();
b.m1();
b.m2();
Derived d=new Derived();
d.m1();
d.m2();
d.m3();

}
}