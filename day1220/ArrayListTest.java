package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add("��");
		list.add("���");
		list.add(100);
		list.add(true);
		list.add("��");
		list.add("����");
		list.add("��");
		
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
	}

}
/*
  [��, ���, 100, true, ��, ����, ��]
  	������ �����ϰ� �ߺ��� ����ؿ�!
  	� �ڷ����̶� ok! 
  	
  	[��, ���, 100, true, ��, ����, ��]
	[��, 100, true, ��, ����, ��]

  */
