package com.kita.array;

public class DoubleArray {

	public static void main(String[] args) {
		
		int[][] arr1 = new int[2][3];
				
		System.out.println(arr1.length); // 첫번째 인덱스 칸수가 뜸
		
		
		
		
		int[][] arr2 = {
				{10, 20, 30},
				{12, 13, 14},
		};
		
		for(int i=0; i<arr2.length; i++) {
			for(int z=0; z<arr2[i].length; z++) {
				System.out.println(arr2[i][z] + ", ");
			}
		}
		System.out.println(arr2[0].length); // 직접 0번째 칸을 인덱스로 입력해줘야됨 (안에숫자보려면)
		
		
		
		
		

	}

}
