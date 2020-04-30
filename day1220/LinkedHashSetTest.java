package com.bit.exam01;
//hashset은 중복이 안됨, 자료의 순서도 유지해주지 않음. 오직 중복관리만 해준다. 

import java.util.HashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		hs.add("귤");
		hs.add("사과");
		hs.add("감");
		hs.add("딸기");
		hs.add("귤");
		
		System.out.println(hs);
	}
		
}
	/*
	 [감, 귤, 사과, 딸기] 로 출력됨. 
	 	-5개를 담았는데 4개만 나오는 이유
	 		==>귤은 중복되었어요! 
	 	Set은 중복을 허용하지 않아요! 
	 	-왜 데이터가 내가 담은 순서를 유지하지 않나요?
	 		==> hashset은 중복을 허용하지 않는것만 생각하고 
	 			data의 순서는 생각하지않아요.
	 */