package com.kita.array;

public class NotOverLap1 {

	/*
	 *  중복숫자 제거 
	 */
	
	public static void main(String[] args) {
		
		
		int len = 3;
		int[] arr = {1,1,5,4,4,3,2};
		
		for (int i=0; i<arr.length; i++) {
			
			
			for(int z=0; z<i; z++) { 	 // z<i <-- z는 i보다 적을때까지 안쪽for문이 반복
				if(arr[i] == arr[z]) {   // arr[1] == arr[z]가 같을경우 i값 낮추고 다시 
										 // 첫번째for문이 반복 시작, 첫시작에서 arr[0] 과 arr[0]을 비교안하겠단 뜻 
					i--;
					break;     
				}
			}
		}
		
		for(int val : arr) {
			System.out.println(val);
		}
	}
}
