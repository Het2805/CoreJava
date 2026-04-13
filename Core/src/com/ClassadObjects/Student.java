package com.ClassadObjects;

public class Student {
	String name;
	int age;
		
	void display() {
		System.out.println("Your Name:-"+name);
		System.out.println("Your Age:-"+age);
	}
 public static void main(String[] args) {
	Student s=new Student();
	s.name="Het patel";
	s.age= 25;
	s.display();
	
}
}