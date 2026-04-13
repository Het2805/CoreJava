package com.ClassadObjects;

public class Constructer {
	String sname;
	int age;
	
	Constructer(){
		sname="Jenil";
		age=25;
	}
	Constructer(String s,int a){
		sname=s;
		age=a;
	}
	
	void display() {
			System.out.println("Your Name Is "+ sname +" And Your Age "+ age);
	}
	
	public static void main(String[] args) {
		Constructer c=new Constructer();
		Constructer c1=new Constructer("Tirth",20);
		c.display();
		c1.display();
	}

}