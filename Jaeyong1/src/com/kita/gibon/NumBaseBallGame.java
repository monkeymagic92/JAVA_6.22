package com.kita.gibon;

import java.util.*;

public class NumBaseBallGame {

	/* 숫자 야구 게임 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int LEN = 3;

		System.out.printf("숫자 %d 자리 야구 게임 시작\n\n", LEN);

		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];

		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) (Math.random() * 9 + 1);

			for (int z = 0; z < i; z++) {
				if (rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}

		System.out.print("정답공개 : ");
		for (int val : rArr) {
			System.out.printf("%d ", val);
		}

		int cnt = 0;
		while (true) {
			cnt++;
			int s = 0, b = 0;

			System.out.print("\n숫자 입력: ");
			for (int i = 0; i < myArr.length; i++) {
				myArr[i] = scan.nextInt();
			}

			for (int i = 0; i < LEN; i++) {
				for (int z = 0; z < LEN; z++) {
					if (rArr[i] == myArr[z]) {
						if (i == z) {
							s++;
						} else {
							b++;
						}
					}
				}
			}

			if (s == LEN) {
				break;
			}

			System.out.printf("S:%d / B:%d / O:%d\n", s, b, (LEN - s - b));
		}

		System.out.printf("%d 시도 - End!", cnt);

	}

}
