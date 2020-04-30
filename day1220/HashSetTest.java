package com.bit.exam01;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet hs = new LinkedHashSet();
		hs.add("귤");
		hs.add("사과");
		hs.add("감");
		hs.add("딸기");
		hs.add("귤");
		
		System.out.println(hs);
	}
		
}
	/*
	 [귤, 사과, 감, 딸기]로 출력됨.
	 
	 	==>LinkedHashSet은 내가 담은 데이터의 순서도 유지해요!
    */