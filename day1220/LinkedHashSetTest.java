package com.bit.exam01;
//hashset�� �ߺ��� �ȵ�, �ڷ��� ������ ���������� ����. ���� �ߺ������� ���ش�. 

import java.util.HashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		hs.add("��");
		hs.add("���");
		hs.add("��");
		hs.add("����");
		hs.add("��");
		
		System.out.println(hs);
	}
		
}
	/*
	 [��, ��, ���, ����] �� ��µ�. 
	 	-5���� ��Ҵµ� 4���� ������ ����
	 		==>���� �ߺ��Ǿ����! 
	 	Set�� �ߺ��� ������� �ʾƿ�! 
	 	-�� �����Ͱ� ���� ���� ������ �������� �ʳ���?
	 		==> hashset�� �ߺ��� ������� �ʴ°͸� �����ϰ� 
	 			data�� ������ ���������ʾƿ�.
	 */