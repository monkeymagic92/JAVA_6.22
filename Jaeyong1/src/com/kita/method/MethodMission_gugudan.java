package com.kita.method;

/*
 *  구구단 메소드 만들기
 *  guguDan(5) => 5단 구구단 출력
 *  guguDan(4) => 4단 구구단 출력
 */

public class MethodMission_gugudan {
		
	
	// 1) 인자값 하나만 구구단 출력하는 메소드
	public static void guguDan(int number) { 
		
		int j = 1; 
		for (int i = 0; i < 9; i++) {
			System.out.printf("%d * %d = %d\n", number, j, (number * j));
			j++;
		}
	}
	
	
	// 2) 인자값2개 받아 sDan1 ~ eDan2 까지 구구단을 출력하는 메소드 (1번메소드 호출)
	public static void guguDan(int sDan, int eDan) {
		for(int i = sDan; i<=eDan; i++) {
			guguDan(i);
		}
	}
	
	

	
	public static void main(String[] args) {
		
		guguDan(4,6);
	}

}
