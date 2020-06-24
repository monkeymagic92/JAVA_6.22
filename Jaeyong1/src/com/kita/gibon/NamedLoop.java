package com.kita.gibon;

public class NamedLoop {

	public static void main(String[] args) {
		
		// 즉 Parent 는 if-break처럼 그쪽 for문만 종료하는게아닌 if조건에 사용시 
		// 완전 전체 for문을 박살낸다는뜻
		
		Parent:
		for(int i=0; i<10; i++) {
			
			for(int z=0; z<20; z++) {
				
				if (z == 15) {
					break Parent;
				}
				System.out.printf("%d - %d\n", i , z);
			}
		}

	}

}
