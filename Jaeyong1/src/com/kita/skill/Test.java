package com.kita.skill;

public class Test {

	
	public static void main(String[] args) {
		
		Test11.brand = "삼성";
		
		Test11 t1 = new Test11("평면Tv",22);
		Test11 t2 = new Test11("볼록Tv",10);
		
		
		Test11.a();
		System.out.println("----");
		t1.aa();
		t2.aa();
		
		
	}

}
