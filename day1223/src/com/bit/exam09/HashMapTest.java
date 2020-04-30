package com.bit.exam09;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("addr", "서울");
		map.put("tel", "111");
		System.out.println(map.get("addr")); //아래보다 이게 더 직관적
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("서울");
		list.add("111");
		System.out.println(list.get(1));
	
	}
//해쉬맵이 가장 많이 쓰여짐.
}
