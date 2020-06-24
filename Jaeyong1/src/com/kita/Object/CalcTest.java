package com.kita.Object;


public class CalcTest {

	public static void main(String[] args) {

		// static을 사용한 메소드 호출
		System.out.println(Calc.sum(10, 20));

		
		// static을 사용하지않은,  인스턴스 생성후 메소드 호출
		Calc calc1 = new Calc();
		calc1.n1 = 20;
		calc1.n2 = 30;

		System.out.println(calc1.sum());

	}

}

