package com.kita.Object;

// 생성자란

// 이름이 클래스 타입과 똑같다
// return 타입이 없다 (즉 return 넣는순간 이건 오버로딩 메소드 스타일 됨)
// 생성자도 오버로딩 ( 같은이름으로 여러개 만들수 있음 )

// this.를 쓰는이유 
// 메소드 (매개변수) 와 멤버변수의 이름이 같을경우 구분짓기위해..

public class Car {

	String name;
	String color;
	int cc;

	// 생성자란
	// 이름이 클래스 타입과 똑같다
	// return 타입이 없다 (즉 return 넣는순간 이건 오버로딩 메소드 스타일 됨)
	// 생성자도 오버로딩 ( 같은이름으로 여러개 만들수 있음 )

	// 생성자 작성하는 것
	// 마우스우클릭 -> source -> 제네레터 커스터즈 유즈 어쩌고 (밑에꺼)

	public Car() {
		this("쏘나타", "흰색", 2500);
	}

	public Car(String name) {
		this(name, "흰색", 2500);
	}

	public Car(String name, String color) {
		this(name, color, 2500);
	}

	public Car(String name, String color, int cc) {
		super();
		this.name = name;
		this.color = color;
		this.cc = cc;
	}

	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다\n", name, color, cc);
	}

}
