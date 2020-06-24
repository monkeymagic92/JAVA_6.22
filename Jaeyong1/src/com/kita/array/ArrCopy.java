package com.kita.array;

import java.util.Arrays;

public class ArrCopy {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 7, 10, 15, 21};
		int[] arr2 = new int[arr.length];
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i];
		}
		
		
		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		
		if(arr != null) {
			System.out.println("arr2 : " + Arrays.toString(arr2));
		}

	}

}
