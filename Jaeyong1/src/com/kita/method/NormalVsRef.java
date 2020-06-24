package com.kita.method;

public class NormalVsRef {

	// 일반메소드
	public static void changeVal(int num) {
		num = 30;
	}
	
	// 매개변수가 레퍼런스 인 메소드
	public static void changeVal(int[] numArr) {
		numArr[0] = 30;
	}
	
	
		
	public static void main(String[] args) {
	
		int num = 10;
		System.out.println("before num : " + num);
		
		changeVal(num);
		System.out.println("after num : " + num);
		
		
		
		
		int[] numArr = {10};
		System.out.println("before numArr[0] : " + numArr[0]);
		changeVal(numArr);
		System.out.println("after numArr[0] : " + numArr[0]);
		
	}

}

