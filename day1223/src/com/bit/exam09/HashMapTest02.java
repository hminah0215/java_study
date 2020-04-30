package com.bit.exam09;


import java.util.HashMap;

public class HashMapTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("addr", "서울");
		map.put("tel", "111");
		System.out.println(map);
/*
		  {name=홍길동, tel=111, addr=서울}  <-- 이렇게 출력
		  데이터의 입력순서가 유지되지않아요.
		  입력순서를 유지하기 원하면 linkedHashmap사용해야함. 
		 
*/
	}

}
