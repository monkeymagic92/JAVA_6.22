package com.kita.Object;

// 사용자 정의 클래스
public class Tv {
	// 멤버 필드
	String name;
	boolean power;
	int channel;
	

	
	// 멤버 메소드
	void changePower() { // 호출할때마다 power가 반대반대 됨  Tv전원 껏다켰다 (?)
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}


