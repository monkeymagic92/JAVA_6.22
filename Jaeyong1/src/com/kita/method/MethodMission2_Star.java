package com.kita.method;

public class MethodMission2_Star {

	// 1) num값 만큼 별 찍는 메소드
	public static void printStar(int num) {

		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	
	// 2) num값 만큼 [개행 num 수,별 num 수] 찍는 메소드 (1번 메소드 호출)
	public static void printStarSqure(int num) {

		for (int i = 0; i < num; i++) {
			printStar(num);
		}
	}
	

	// 3) num값 만큼 반삼각형으로 출력 
	public static void printStarTriangle(int num) {
		
		for(int i=1; i<=num; i++) {
			printStar(i);
		}
	}
	
	
	// 4) 빈공백 메소드 추가 , 별찍기 메소드 추가   
	public static void printStarTriangleReverse(int num) {
		
		for(int i=num-1; i>=0; i--) {
			printChar(' ',i);
			printStar(num-i);
			
		}
	}
	
	
	// 5) 빈 공백을 몇개 줄지 결정하는 메소드
	public static void printChar(char ch, int count) {
		for(int i=0; i<count; i++) {
			System.out.print(ch);
		}
	}
	
	
	
	// Star 메소드 쭉 출력
	public static void main(String[] args) {
		
		// 1)
		printStar(4);
		System.out.println("------");
		
		// 2)
		printStarSqure(5);
		System.out.println("------");
		
		// 3)
		printStarTriangle(5);
		System.out.println("------");
		
		// 4)
		printStarTriangleReverse(5);
		System.out.println("-----");
		
		// 5)
		printChar('5',5);

		
		
	}

}
