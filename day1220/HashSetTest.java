package com.bit.exam01;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet hs = new LinkedHashSet();
		hs.add("��");
		hs.add("���");
		hs.add("��");
		hs.add("����");
		hs.add("��");
		
		System.out.println(hs);
	}
		
}
	/*
	 [��, ���, ��, ����]�� ��µ�.
	 
	 	==>LinkedHashSet�� ���� ���� �������� ������ �����ؿ�!
    */