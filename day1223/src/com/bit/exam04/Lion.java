package com.bit.exam04;

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
		System.out.println("proLion �Դϴ�.");
		System.out.println(title);
	}
}
