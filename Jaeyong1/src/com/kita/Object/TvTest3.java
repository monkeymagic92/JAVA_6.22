package com.kita.Object;

public class TvTest3 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		tvArr[0].name = "이재용";
		tvArr[1].name = "올?";
		
		System.out.println(tvArr[0].name);
		System.out.println(tvArr[1].name);
		
		
		
	}

}
