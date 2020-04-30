package com.bit.exam01;

public class WrapperTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;						//기본자료형 변수
		Integer ob = new Integer(a);	//참조자료형 변수, 객체
		System.out.println(a);
		System.out.println(ob);
		
		Integer ob2 = a; 	//auto boxing
		System.out.println(ob2);
		
		int b = ob.intValue();	//그 객체가 가지고 있는 값을 다시 기본값으로 가지고 올때
		System.out.println(b);
		
		int c = ob;				//auto unboxing
		System.out.println(c);	//현재의 자바는 이렇게 할 수 있음. 
	}

}
