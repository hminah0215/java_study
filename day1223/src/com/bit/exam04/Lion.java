package com.bit.exam04;

// Lion is a Animal 사자는 동물이다. 
// Lion 클래스와 Animal 클래스는 "is a 관계"에 있어요.
// is a 관계에 있을때만이 형변환이 가능해요. 

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
}
