package com.kita.method;

// Method (메소드)
//객체안에 있으면 메소드 (자바) , 객체밖에 있으면 함수 (c언어) 하지만 메소드 = 함수 결국 같다고보면됨

		//public static void main(String[] args)   <-- 메소드의 선언부 (이름선언 , 즉 변수선언하듯이)

		// {     ............     }       <-- 메소드 구현부 (속성,기능)

		/*
		 * 	main = 메소드 명
		 *  void = 리턴타입 , (참조변수, 일반변수 하나 넣음)
		 *  ( ) <-- 파라미터 , 매개변수
		 *  
		 *  메소드는 void 든 아니든 무조건 return이 들어가야됨
		 *  하지만 자바는 void에서 return안적어도 알아서 안보이게 return 적어줌
		 */
		
		
public class Method1 {
	
	
	public static void sum(int n1, int n2) {
		System.out.println(n1 + n2);
		minus(n1,n2);
	}
	
	public static void minus(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	
	int add(int n1, int n2) {
		return n1 + n2;
	}
	
	
	// main 메소드
	public static void main(String[] args) {
		
		sum(10,15);  
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
