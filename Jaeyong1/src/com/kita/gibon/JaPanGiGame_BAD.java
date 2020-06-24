package com.kita.gibon;

import java.util.Scanner;

public class JaPanGiGame_BAD {

	
	/*
	 * 1. 사이다(500원)
	 * 2. 콜라(600원)
	 * 3. 환타(700원)
	 * 4. 마운틴듀(800원)
	 * 5. 초코우유(400원)
	 * 6. 바나나우유(400원)
	 * 
	 * 메뉴를 선택하세요 : (종료:0) 1
	 * 사이다 500원
	 * 메뉴를 선택하세요 : (종료:0) 5
	 * 초코우유 400원
	 * 메뉴를 선택하세요 : (종료:0) 7
	 * 잘 못 입력 !!!
	 * 메뉴를 선택하세요 : (종료:0) 0
	 * 종료! 900원 사용 <---
	 */
	
	public static void menuJuice() {
		System.out.println("===메뉴표===");          
		System.out.println("1. 사이다(500원)");
		System.out.println("2. 콜라(600원)");
		System.out.println("3. 환타(700원)");
		System.out.println("4. 마운틴듀(800원)");
		System.out.println("5. 초코우유(400원)");
		System.out.println("6. 바나나우유400원)");
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int pay = 0; // 값 누적변수
			
		while(true) {
			
			menuJuice();	// 가격표를 부를 메소드		
			System.out.print("메뉴를 선택하세요(종료:0) : ");
			int user = scan.nextInt();    // 
			if(user == 0) {
				System.out.println("종료");
				break;
			}
			
			if(user == 1) {
				pay += 500;
				System.out.println("콜라선택했어요~^^ 500원짜리~ 떠리떠리~");
			} else if( user == 2) {
				pay += 600;
			} else if( user == 3) {
				pay += 700;
			} else if( user == 4) {
				pay += 800;
			} else if( user == 5) {
				pay += 400;
			} else if( user == 6) {
				pay += 400;
			} else {
				System.out.println("잘못입력!");
				
			}
		}
		System.out.printf("\n총금액 : %d\n",pay);
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
