package com.ConstructorsandDestructors;

class Demo{
	  String name;
	  int age;
	  Demo(){
		  System.out.println("Default Constructor");
		  name="Jenil";
		  age=25;
	  }
	 Demo(String s){
		 System.out.println("One Parameterized Constructor");
		 name=s;
		 age=15;
	 }
	 Demo(String s,int a){
		 System.out.println("Two Parameterized Constructor");
		 name=s;
		 age=a;
	 }
	 void Display(){
		 System.out.println("Name:- "+name+" Age :- "+age);
	 }
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Demo d= new Demo();
		d.Display();
		Demo d1 =new Demo("Tirth");
		d1.Display();
		Demo d2=new Demo("Yash",30);
		d2.Display();
		
}

}