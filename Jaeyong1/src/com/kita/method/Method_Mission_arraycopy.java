package com.kita.method;

import java.util.Arrays;

public class Method_Mission_arraycopy {

	public static int[] copyArr(int[] arr) {

		int[] arrCopyItem = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrCopyItem[i] = arr[i];
		}

		return arrCopyItem;
	}

	
	
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 10, 55, 77 };
		int[] arr2 = new int[arr.length];
		arr2 = copyArr(arr);

		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		System.out.println("arr2 : " + Arrays.toString(arr2));

	}

}
