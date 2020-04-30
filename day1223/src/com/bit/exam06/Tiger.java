package com.bit.exam06;

public class Tiger extends Animal {
	@Override
	public String toString() {
		return "Tiger [year=" + year + "]";
	}


	private int year;
	
	
	public Tiger(int year) {
		super();
		this.year = year;
	}


	public void proTiger() {
		System.out.println("proTiger 입니다.");
		System.out.println(year);
	}
}
