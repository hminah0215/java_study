package com.bit.exam01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet hs = new TreeSet();
		hs.add("귤");
		hs.add("사과");
		hs.add("감");
		hs.add("딸기");
		hs.add("귤");
		
		System.out.println(hs);
	}
		
}
	/*
		[감, 귤, 딸기, 사과]
		==> TreeSet은 값의 크기에 따라 정렬해요! 
    */