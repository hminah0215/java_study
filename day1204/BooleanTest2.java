//�л��� ������ �Է¹޾� 60�� �̻��̸� '�հ�'
//�׷��� ������ "���հ�"�� ���

import java.util.Scanner;
class BooleanTest2 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  int score; //�л�����
	  boolean ispass; //�հݿ���
	  String result; //�հ� ���հ� �����ϴ� ����

	  System.out.println("������ �Է��ϼ���.");
	  score = sc.nextInt();
		ispass = score >= 60; //�񱳿����ڻ��

		if(ispass)
			result = "�հ�";
		else
			result = "���հ�";
		
		 System.out.println(result);
	}
}
