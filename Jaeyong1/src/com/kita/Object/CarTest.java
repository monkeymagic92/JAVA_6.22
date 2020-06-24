package com.kita.Object;

public class CarTest {

	public static void main(String[] args) {

		Car car = new Car();
		Car car1 = new Car("소나타", "흰색", 2500); // 생성자 만든것
		Car car2 = new Car("G80"); // 생성자 매개변수 1개짜리
		Car car3 = new Car("그랜저");// 생성자 매개변수 1개짜리
		Car car4 = new Car("아반떼","빨간색");

		System.out.println("1");
		car.introduceMyCar(); // 
		System.out.println("2");
		car1.introduceMyCar();
		System.out.println("3");
		car2.introduceMyCar();
		System.out.println("4");
		car3.introduceMyCar();
		System.out.println("5");
		car4.introduceMyCar();
		
		// 즉 생성자도 메소드의 오버로딩처럼 매개변수값을 조정해서
		// 값을 지정할수있음 ( 메소드 오버로딩이랑 똑같은 원리 ) 

	}

}
