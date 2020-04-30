package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest03 {   //제네릭!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> list = new ArrayList<Person>();
		//리스트안에 담는 타입을 person으로 제한하겠어라는 뜻
		list.add(new Person("홍길동", 20));
		list.add(new Person("이순신", 40));
		list.add(new Person("유관순", 30));
		
		for(int i = 0 ; i < list.size();i++) {
			Person p = list.get(i);
			System.out.println(p);
			p.sayHEllo();
		}
		
	}

}
