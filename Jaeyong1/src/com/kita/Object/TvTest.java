package com.kita.Object;

public class TvTest {

	Tv tv1;  // [전역변수]는 null값 안줘도 됨
	public static void main(String[] args) {
		
		Tv tv1 = new Tv(); // [지역변수]는 null값이라도 지정해줘야 에러안뜸
		  				   //  Tv() <-- 기본생성자
		
		
		System.out.println("기본값\n스트링 : "
				+ "null\n불린 : false\n인트 : 0\n");
		
		System.out.println("name :" + tv1.name);
		System.out.println("power : " + tv1.power);
		System.out.println("channel: " + tv1.channel);
		
		System.out.println("-----------------------");
		tv1.name = "삼성Tv";
		System.out.println("name : " + tv1.name);
		tv1.changePower();
		System.out.println("chanePower : " + tv1.power);
		tv1.changePower();
		System.out.println("chanePower : " + tv1.power);
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("channel : " + tv1.channel);
		tv1.channelDown();
		tv1.channelDown();
		System.out.println("channel : " + tv1.channel);
		
		
		
		
		
	}

}
