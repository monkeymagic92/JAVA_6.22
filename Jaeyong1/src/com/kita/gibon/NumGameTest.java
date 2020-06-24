package com.kita.gibon;

import java.util.*;

public class NumGameTest {

	/*
	 * 숫자 야구 게임 랜덤한 중복되지 않은 숫자 3개(유동적)(4개..~) 출력 ---------------------------- S
	 * 스트라이크 : 숫자 자리 다맞춘경우 B 볼 : 숫자만 맞춘경우 o 아웃 : 숫자 , 자리 다 틀린경우
	 * ----------------------------- 즉, 한게임당 [ S + B + O = 3 ] 이 나와야됨
	 * 
	 * rArr = 컴퓨터가 내준 랜덤값 myArr = 사용자가 입력한 인덱스 [0,1,2] 값
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int LEN = 3; // 숫자3개짜리게임 , 4개짜리게임 유동적으로 만들기

		int[] rArr = new int[LEN]; // 랜덤값 숫자 넣기
		int[] myArr = new int[LEN]; // 사용자 숫자 입력값
		boolean run = true; // 게임 실행 종료창

		// -------------------------------------------------------

		// 컴퓨터가 랜덤한숫자(1~9) 3개를 중복되지 않게 생성
		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) (Math.random() * 9 + 1);
			for (int z = 0; z < i; z++) {
				if (rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}

		
		// 게임실행
		while (run) {

			System.out.print("=정답 공개     : ");
			for (int val : rArr) {
				System.out.printf("%d ", val);
			}

			int sCount = 0; // 스트라이크 갯수누적
			int bCount = 0; // 볼 갯수 누적

			System.out.print("\n=사용자 입력  : ");

			for (int i = 0; i < myArr.length; i++) {
				myArr[i] = scan.nextInt();

				for (int j = 0; j < rArr.length; j++) {
					if (myArr[i] == rArr[i]) {
						sCount++;
						if (myArr[i] == rArr[j]) {
							bCount++;
						}
					}
				}
			}

			System.out.printf("스트라이크 갯수 : %d\n", sCount);
			System.out.printf("볼 갯수 : %d\n", bCount);

			
		}

	}

}
