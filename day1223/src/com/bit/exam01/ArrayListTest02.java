package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest02 {

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
		
		for(int i = 0; i< list.size();i++) { //컬렉션프레임워크에서는 랭쓰대신 사이즈
			Object obj= list.get(i);//자료형이 다 달라서 그걸담을수있게 조상님호출
			System.out.println(obj);
			if(obj instanceof Person) {//캐스팅할수있나없나 물어봄
				((Person)obj).sayHEllo();
			}
		}
		//이렇게 물어봐야해서 켈렉션프레임워크 쓸때 자료형을 맞추자!라는 것. 그게 제네릭
	}

}
