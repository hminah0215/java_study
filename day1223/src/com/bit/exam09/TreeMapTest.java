package com.bit.exam09;

import java.util.TreeMap;


public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("name", "홍길동");
		map.put("addr", "서울");
		map.put("tel", "111");
		System.out.println(map);
/*
		  {addr=서울, name=홍길동, tel=111} <-- 이렇게 출력
		  키값을 기준으로 정렬되어요!  
		 
*/
	}

}
