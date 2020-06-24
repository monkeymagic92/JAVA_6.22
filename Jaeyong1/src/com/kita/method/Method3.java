package com.kita.method;

public class Method3 {

	// 숫자를 문자열로 return할시
	
	public static String sum1(int n1, int n2) {
		return n1 + n2 + "";
	}
	
	public static String sum2(int n1, int n2) {
		return "" + n1 + n2;
	}
	
	
	// 파싱기법
	public static String sum3(int n1, int n2) {
		return String.valueOf(n1 + n2);
	}
	
	
	// 절대값(양수)만 나타내는 뺄셈 메소드 
	public static int sum4(int n1, int n2) {
		
		if(n1 > n2) {
			return n1 - n2;
		} else {
			return n2 - n1;
		}
	}
	
	
	public static void main(String[] args) {
		
		// 비void형은 어떤값을 사용하기위해 담을변수 하나 생성후 그 변수에 메소드값을 넣음
		
		String result1 = sum1(15,10);  // 메소드앞에 = 이있으면 100% 리턴값이 있는 메소드
		String result2 = sum2(15,10);
		String result3 = sum3(15,10);
		int result4 = sum4(5,10);
		
		System.out.println(result1);		
		System.out.println(result2);		
		System.out.println(result3);		
		System.out.println(result4);
		
		

	}

}
