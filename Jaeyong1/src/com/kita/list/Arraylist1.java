package com.kita.list;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		// <Integer>을 사용하면 애초에 정수값만 받겠다란 것(제네릭)
		
		list.add(1); // 인덱스[0]번 자리에 1을 넣겠다 
		list.add(2);
		list.add(3);
		list.add(10);
		
		list.add(2, 11); // 인덱스[2]번 자리에 11 이란 숫자를 넣겠다
		
		list.remove(list.size() - 1);  // list 총길이(size()) 에서  제일 마지막 인덱스 값을 지움
		list.remove(list.size() - 1);  // list 총길이(size()) 에서  제일 마지막 인덱스 값을 지움 (현재 총 2번 지웠단거임)
		
		int value = list.get(2); // 인덱스[2]번째 자리값만 확인한다는 뜻
		System.out.println(value);
		
		
		
		for(int i=0; i<list.size(); i++) {
			int val = list.get(i);
			System.out.print(val + ", ");
		}
		
		System.out.println("\n--------");
		
		for(int val : list) {
			System.out.print(val + ", ");
		}
		
	

	}

}
