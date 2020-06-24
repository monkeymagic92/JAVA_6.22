package com.kita.skill;

import java.util.Scanner;


public class ArrayChoice_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = {"이재용","홍길동","박두두"};
		
		System.out.print("입력 : ");
		int user = scan.nextInt();
		
		System.out.println(name[user]);

	}

}
