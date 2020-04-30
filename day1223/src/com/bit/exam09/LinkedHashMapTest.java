package com.bit.exam09;

import java.util.LinkedHashMap;


public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("name", "홍길동");
		map.put("addr", "서울");
		map.put("tel", "111");
		System.out.println(map);
/*
		  {name=홍길동, addr=서울, tel=111} <-- 이렇게 출력
		  데이터의 입력순서가 유지됩니다.
		  
		 
*/
	}

}
