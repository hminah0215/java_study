package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int []arr = new int [5];//�⺻�ڷ����迭
		ArrayList list = new ArrayList();//�÷��������ӿ�ũ
		//�󸶵��� �迭�� ���� �� ����.
		
		list.add("��");
		list.add(28);
		list.add(new Person("ȫ�浿",20));//����Ʈ�� ������ ���
		list.add(new Person("�̼���",40));
		list.add(true);
		list.add(5.8);
		
		for(int i = 0; i< list.size();i++) { //�÷��������ӿ�ũ������ ������� ������
			Object obj= list.get(i);//�ڷ����� �� �޶� �װɴ������ְ� �����ȣ��
			System.out.println(obj);
			if(obj instanceof Person) {//ĳ�����Ҽ��ֳ����� ���
				((Person)obj).sayHEllo();
			}
		}
		//�̷��� ��������ؼ� �̷��������ӿ�ũ ���� �ڷ����� ������!��� ��. �װ� ���׸�
	}

}
