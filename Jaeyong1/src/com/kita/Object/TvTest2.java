package com.kita.Object;

public class TvTest2 {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		Tv tv2 = tv1;
		
		tv1.channelUp(); // tv1.의 주소값
		tv2.channelUp(); // tv2.의 주소값 = tv1주소와 동일
		
		System.out.println("tv1 : " + tv1.channel);
		System.out.println("tv2 : " + tv2.channel);
	}

}
