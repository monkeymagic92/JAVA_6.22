package com.kita.Object;

public class MonitorTest2 {

	public static void main(String[] args) {
		
		// static 붙은 것은 클래스명. (변수,메소드명)
		// 객체마다 ex)m1.m2.m3 등 다른 값을 줘야될때는 static붙이면 안됨
		// 즉 한가지만 일정한 값을 줘야될떄 static 사용함 
		
		Monitor.brand = "삼성";
		Monitor.printBrand();
		
		
		// static 안붙으면 인스턴스 생성해야됨
		Monitor m1 = new Monitor();
		m1.printInfo();
		
		int result = Integer.parseInt("11");

	}

}
