package com.bit.exam05;

// Lion is a Animal ���ڴ� �����̴�. 
// Lion Ŭ������ Animal Ŭ������ "is a ����"�� �־��.
// is a ���迡 ���������� ����ȯ�� �����ؿ�. 

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

