package com.kita.array;

public class DArrayMission {

	public static void main(String[] args) {
		
		/* 
		 * 영어합계 :  / 평균 : 
		 * 수학합계 :  / 평균 : 
		 * 국어합계 :  / 평균 : 
		 * 전체합계 :  / 평균 : 
		 */
		
		String[] sub = {"영어","수학","국어","사회"};  // 과목별 선택
		
		int[][] arr = {
				{90, 100, 88},  // 영어
				{34, 99, 45, 24},	// 수학
				{98, 65, 87},	// 국어
				{55, 62, 95}	// 사회
				
		};
		
		
		int maxTotal = 0; // 3과목 전체 합을 담을 변수
		
		for(int i=0; i<arr.length; i++) {
			
			int total = 0; // 한과목당 합계누적 , 과목 ,점수 추가할때마다 변경값 출력 
			for(int j=0; j<arr[i].length; j++) {
				
				total += arr[i][j];
				maxTotal += arr[i][j];
			}
			
			System.out.printf("%s 점수 합계 : %d // 평균 : %.1f\n\n",sub[i],total,total / 3.0);
		}
			System.out.printf("전체 합계 : [ %d ]",maxTotal);
	
	}

}
