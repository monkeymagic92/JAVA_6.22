package com.kita.Object;

class Person {
	
	static int count;
	private String name;
	private int age;
	
	
	public Person() {}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void add() {
		System.out.println("총 생산된 인원 : " + count++);
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
	
	
	
	
	
	
	
	
}

public class StaticTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("이재용");
	}

}
