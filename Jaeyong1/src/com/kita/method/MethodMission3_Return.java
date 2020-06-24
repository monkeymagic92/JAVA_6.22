package com.kita.method;

public class MethodMission3_Return {

	public static int abs(int n1) {
	
		/*  이런 방법도있고
		 
		if(n1 < 0) {
			return -n1;
		}
		
		return n1;
		*/
		
		// 이런 방법도 있고
		return (n1 < 0) ? -n1 : n1;
	}
	
	
		
	public static void main(String[] args) {
		
		
		// 절대값을 구하는 메소드
		int result = abs(10);
		System.out.println(result);
		
		result = abs(-10);
		System.out.println(result);

	}

}
