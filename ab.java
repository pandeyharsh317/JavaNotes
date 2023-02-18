// Write a program to take five names as input and display names in alphabetical order.

import java.util.*;
class name
{
public static void main(String[] args){

String[] name=new String[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter five Name");
for(int i=0;i<name.length;i++){
name[i]=sc.nextLine();
}
Arrays.sort(name);
System.out.println("Name is alphabetical order");
for(String n:name){
System.out.println(n);
}


}

}