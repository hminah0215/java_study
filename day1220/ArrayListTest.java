package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add("±Ö");
		list.add("»ç°ú");
		list.add(100);
		list.add(true);
		list.add("°¨");
		list.add("µş±â");
		list.add("±Ö");
		
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
	}

}
/*
  [±Ö, »ç°ú, 100, true, °¨, µş±â, ±Ö]
  	¼ø¼­µµ À¯ÁöÇÏ°í Áßº¹µµ Çã¿ëÇØ¿ä!
  	¾î¶² ÀÚ·áÇüÀÌ¶óµµ ok! 
  	
  	[±Ö, »ç°ú, 100, true, °¨, µş±â, ±Ö]
	[±Ö, 100, true, °¨, µş±â, ±Ö]

  */
