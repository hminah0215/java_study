package com.bit.exam01;

public class WrapperTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;						//�⺻�ڷ��� ����
		Integer ob = new Integer(a);	//�����ڷ��� ����, ��ü
		System.out.println(a);
		System.out.println(ob);
		
		Integer ob2 = a; 	//auto boxing
		System.out.println(ob2);
		
		int b = ob.intValue();	//�� ��ü�� ������ �ִ� ���� �ٽ� �⺻������ ������ �ö�
		System.out.println(b);
		
		int c = ob;				//auto unboxing
		System.out.println(c);	//������ �ڹٴ� �̷��� �� �� ����. 
	}

}
