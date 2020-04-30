package com.bit.exam06;


public class Lion extends Animal {
	private String title;
	
	public Lion(String title) {
		super();
		this.title = title;
	}

	public void proLion() {
		System.out.println("proLion 입니다.");
		System.out.println(title);
	}

	@Override
	public String toString() {
		return "Lion [title=" + title + "]";
	}
	
}   

