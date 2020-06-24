package com.kita.gibon;

public class Break {

	public static void main(String[] args) {
		
		for(int z=0; z<10; z++) {
			for(int i=0; i<3; i++) {
				if(z==3) { break; }  // break는 가까운 포문 + 그 포문 포함된 아래를 종료
									 //함 즉 - 3부분제외한 나머지 다출력됨
				System.out.printf("%d - %d\n",z,i);
			}
		}

	}

}
