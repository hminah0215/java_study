package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(new Integer(100));
		list.add(200);	//auto boxing �Ͽ� ����Ʈ�� ��ƿ�. 
		list.add(300);
		
		int sum = 0;
		for(int i =0 ; i < list.size(); i++) {
			//Integer ob = list.get(i);
			//sum = sum + ob; 	//����� �ڵ����� ��ڽ� ��.
			
			//sum = sum + ob.intValue(); �����ڹٿ����� �̷��� 
			
			sum = sum + list.get(i); // auto unboxing ���ٷ�
		}
		System.out.println("����: "+ sum);
	}

}
