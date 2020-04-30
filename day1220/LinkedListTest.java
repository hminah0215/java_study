package com.bit.exam01;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.add("±Ö");
		list.add("»ç°ú");
		list.add("°¨");
		list.add("µþ±â");
		list.add("±Ö");
		
		System.out.println(list);
		list.remove(1); //»ç°ú¸¦ Áö¿ì·Á°í
		System.out.println(list);
	}

}
/*
  [±Ö, »ç°ú, °¨, µþ±â, ±Ö] 
  [±Ö, °¨, µþ±â, ±Ö]
  
*/
