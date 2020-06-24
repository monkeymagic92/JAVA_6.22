package com.kita.list;

import java.util.ArrayList;
import java.util.Arrays;

// 클래스앞에 public을 붙일수 있는건 우리가 처음에 만들때 파일이름과 같은 클래스만 public 가능
/*

 */
public class ListMethod {

	public static void main(String[] args) {

		MyList list = new MyList();
		list.add(10);
		list.add(15);
		
		
		list.add(1,100);
		
		MyArrays.print(list);
		
		
	}

}

class MyArrays {
	
	static void print(MyList list) {
		
		list.allArr();
	}
			
}


class MyList {
	private int[] arr = new int[0];

	/*
	 * // 생성자 만드는 방법 MyList() { init(); }
	 * 
	 * // 생성자 만드는 방법 // 이게 진짜 arr 길이란것 private void init() { arr = new int[0]; }
	 */

		
	
	// private arr 총 길이가 몇칸인지 확인하는 메소드
	void arrSize() {
		System.out.printf("arr총 길이는 : %d\n", arr.length);
	}

	
	
	
	
	// private arr이 총 인덱스 몇번인지 확인하는 메소드
	void indexArr() {
		System.out.printf("arr총 인덱스 번호 : %d\n", arr.length - 1);
	}

	
	
	
	// private arr 모든값 출력하는 메소드
	void allArr() {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i < arr.length - 1) {
				System.out.printf("%d,",arr[i]);
			} else {
				System.out.printf("%d]",arr[i]);
			}
			
		}
	}
	
	
	
	void choiceIndex() {
		
		System.out.println();
	}

	
	
	
	// 값 추가하는 메소드
	void add(int num) {
		int[] temp = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = num;
		arr = temp;

	}

	
	

	// n번방 삭제하기
	void numRemove(int num) {
		int[] temp = new int[arr.length - 1];
		for(int i=0; i<arr.length - 1; i++) {
			if(i < num) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i + 1];
			}
		}
		arr = temp;
	}

	
	
	
	// 인덱스 num1자리에 num2 값을 넣기
	void add(int idx, int num) {
		int[] temp= new int[arr.length + 1];
		
		for (int i=0; i<temp.length; i++) {
			if(i<idx) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i - 1];
			}
			
		}
		temp[idx] = num;
		arr = temp;
	}
	
	
	
	// 마지막 값 지우고, 지우는 값 리턴
	int endRemoveAndReturn(int idx) {
		
		
		int[] temp = new int[arr.length - 1];
	
		for (int i=0; i<temp.length; i++) {
			if(i < idx) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i+1];
			}
		}
		
		int delVal = arr[idx];
		arr = temp;
		return delVal;
		
	}
	
	int remove() {
		return endRemoveAndReturn(arr.length - 1);
	}
	
	
	

	
	
}