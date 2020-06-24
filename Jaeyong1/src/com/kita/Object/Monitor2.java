package com.kita.Object;

public class Monitor2 {
	String brand;
	int inch;
	static int cnt;
	

	public Monitor2(String brand, int inch) {
		super();
		this.brand = brand;
		this.inch = inch;
		cnt++;
		
	}

	void printInfo() {
		System.out.printf("brand : %s, inch : %d\n", this.brand, this.inch);
	}
}
