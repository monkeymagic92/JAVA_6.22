package com.kita.list;

import java.util.Arrays;

public class List {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int[] temp = new int[4];
		
		
		
		// 재용방법 
		for(int i=0; i<temp.length; i++) {
			temp[i] = i+1;
		}
		
		arr = temp;
		System.out.println(Arrays.toString(arr));
		
		
		
		// 정석방법
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
		int[] temp1 = new int[8];
		
		for(int i=0; i<arr1.length; i++) {
			temp1[i] = arr1[i];
		}
		
		temp1[arr1.length] = 8;  // 인덱스번호[7]번 자리에 8을 넣겠다는 뜻  
				
		arr1 = temp1;
		System.out.println(Arrays.toString(arr1));
		
		
		
		
	}
	
		
	
}
