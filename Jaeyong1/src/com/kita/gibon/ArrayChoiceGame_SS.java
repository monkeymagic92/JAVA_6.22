package com.kita.gibon;

import java.util.Scanner;

public class ArrayChoiceGame_SS {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int user = 0; // 값 입력
		int total = 0; // 총누적금액 담을 변수
		boolean run = true;
		
				
		// 선택메뉴 실행
		while(true) {
			
			String[] menuArr = {"사이다","콜라","환타","마운틴듀",
					"초코우유","바나나우유"};
			int[] priceArr = {500, 600, 700, 800, 400, 400};
			
			
			// 출력할시 문자열따로, 정수값 따로 출력됨(볼때는 붙여서 보임)
			System.out.println("-메뉴-");
			for(int i=0; i<menuArr.length; i++) {
				System.out.printf("%d. %s(%,d원)\n"
						,(i+1),menuArr[i],priceArr[i]);
			}
			System.out.print("메뉴선택(종료 : 0) :");
			user = scan.nextInt();
			
			
			// if문 실행! 
			// 종료버튼
			if(user == 0) {
				System.out.printf("\n합계 : %d원",total);
				break;
			} 
			
			// priceArr총 배열길이(6) 보다 크거나 작을경우 에러메세지
			else if(user > priceArr.length || user<0) {
				System.out.println("잘못입력");
			} 
			
			
			// 0 , 0보다 작은수 , 0보다큰수 를 제외한 모든숫자는 else에서 총금액과 선택메뉴 보여주기
			else {
				
				total += priceArr[user-1];
				System.out.printf("%d번 %s / %d원\n\n",user,menuArr[user-1],
						priceArr[user-1]);
			}
		
		}
	}
}
