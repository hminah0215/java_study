package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int []arr = new int [5];//기본자료형배열
		ArrayList list = new ArrayList();//컬렉션프레임워크
		//얼마든지 배열에 담을 수 있음.
		
		list.add("귤");
		list.add(28);
		list.add(new Person("홍길동",20));//투스트링 만들어야 출력
		list.add(new Person("이순신",40));
		list.add(true);
		list.add(5.8);
		System.out.println(list);
		
	}

}
