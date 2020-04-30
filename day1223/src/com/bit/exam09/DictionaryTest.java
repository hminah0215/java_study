package com.bit.exam09;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
	
	public static Scanner sc;
	
	public static void printMenu() {
		System.out.println("***영어 사전 프로그램***");
		System.out.println("1. 추가");
		System.out.println("2. 검색");
		System.out.println("3. 삭제");
		System.out.println("0. 종료");
		System.out.print("메뉴를 선택해주세요==>");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		sc = new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("orange", "오렌지");
		map.put("banana", "바나나");
		
		int menu;
		
		while(true) {
			printMenu();
			menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			switch(menu) {
				case 1: registeWord(map);break;
				case 2: searchWord(map);break;
				case 3: deleteWord(map);break;
		
			}
		}
		System.out.println("프로그램을 종료합니다. ");
		
	}
	private static void deleteWord(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		System.out.println("***단어삭제***");
		String key;
		System.out.println("삭제할 단어를 입력하세요==>");
		key =sc.next();
		String v =map.remove(key);
		
		if(v != null) {
			System.out.println("해당단어" + key+ "를 삭제했습니다.");
		}else {
			System.out.println("삭제에 실패하였습니다.");
			System.out.println(key + "단어는 사전에 없습니다.");
		}
	}

	private static void searchWord(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		String key;
		
		System.out.println("***단어 검색***");
		System.out.print("사전에 찾을 단어를 입력하세요==>");
		key = sc.next();
		String value = map.get(key);
		
		if( value == null) {
			System.out.println("찾는 단어가 없습니다.");
			String sel;
			System.out.println("단어를 등록할까요?(y/n)");
			sel = sc.next();
			if(sel.contentEquals("y")) {
				String v;
				System.out.print("단어의 뜻을 입력하세요==>");
				v= sc.next();
				map.put(key,v);
				System.out.println("단어를 등록하였습니다.");
			}
			
		}else {
		System.out.println("단어의 뜻은 " + value +"입니다.");
		}
	}

	private static void registeWord(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		System.out.println("***새로운 단어 등록***");
		String key,value;
		System.out.println("등록하려는 영어단어 입력하세요 ==>");
		key = sc.next();
		System.out.println("단어의 뜻을 입력하세요==>");
		value = sc.next();
		
		map.put(key, value);
		System.out.println("새로운 단어를 등록했습니다.");
	}

}
