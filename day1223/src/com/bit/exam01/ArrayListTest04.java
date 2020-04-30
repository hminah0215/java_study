package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(new Integer(100));
		list.add(200);	//auto boxing 하여 리스트에 담아요. 
		list.add(300);
		
		int sum = 0;
		for(int i =0 ; i < list.size(); i++) {
			//Integer ob = list.get(i);
			//sum = sum + ob; 	//현재는 자동으로 언박싱 됨.
			
			//sum = sum + ob.intValue(); 옛날자바에서는 이렇게 
			
			sum = sum + list.get(i); // auto unboxing 한줄로
		}
		System.out.println("총합: "+ sum);
	}

}
