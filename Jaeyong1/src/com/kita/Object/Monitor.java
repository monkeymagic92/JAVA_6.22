package com.kita.Object;

public class Monitor {
	static String brand;  // static은 값이 1개밖에 저장안됨
						  // static이 붙으면 class 변수
						  // static을 사용하면 프로그램 시작전 메모리에 자동으로 올라감
	
	int inch; // static이 안붙은건 인스턴스 변수 
	static int cnt;

	
	// 컴퓨터 내용 문구 출력메소드
	void printInfo() {
		System.out.printf("brand : %s, inch : %d\n"
				,this.brand,this.inch);
	}
	
	/* static 이 붙은 메소드는 static붙은 멤버변수만 사용가능
	 
	static void printInch() {
		System.out.println(inch);
	}
	
	*/
	
	
	// monitor2 클래스에 테스트했음
	
	static void printBrand() {
		System.out.println(brand);
		
	}
	
		void add() {
		System.out.println(brand);
		System.out.println(inch);
	}
	
}
