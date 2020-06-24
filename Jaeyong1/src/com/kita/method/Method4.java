package com.kita.method;

public class Method4 {

	public static void sum(int ...arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
		}
		System.out.println("sum :" + sum);
	}
	
	public static void main(String[] args) {
		
		
		// 오버로딩사용 ( 같은이름 메소드로 매개변수값 변경 )
		sum(4, 5);
		sum(5, 7, 9);
		sum(1, 2, 3, 4);
		sum(1, 2, 3, 4, 5);
		sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);// 그이상 무한대급으로 다더할때

	}

}
