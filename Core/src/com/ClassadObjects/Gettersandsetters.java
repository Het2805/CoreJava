
package com.ClassadObjects;

public class Gettersandsetters {
	private String name;
	private int age;
	 public void setName(String n) {
	        name = n;
	    }
	    public void setAge(int a) {
	        age = a;
	    }
	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }

	public static void main(String[] args) {
		Gettersandsetters gs=new Gettersandsetters();
		gs.setName("het");
		gs.setAge(50);
		 System.out.println("Name: " + gs.getName());
	        System.out.println("Age: " + gs.getAge());
	}

}
