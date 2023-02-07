package com.thread;

public class Parent {

	public static void main(String[] args) {
		Child  c=new Child(1, "sham", 20);
//System.out.print(c);/
		siddhu s=new siddhu();
		s.addChild(c);
	}

}
class siddhu{

	public siddhu() {
		super();
		
	}
	public void addChild(Child child) {
		
		System.out.println(child.getAge());
		System.out.println(child.getName());

		System.out.println(child.getId());

//		return false;
	}
}
class Child{
	private int id;
	private String name;
	private int age;
	public Child(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Child [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
