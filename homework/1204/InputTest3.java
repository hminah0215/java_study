/*
�ڵ��� ���� ����ϴ� ���α׷��� �ۼ��Ͽ�����.
����Ÿ��� ����� �ֹ������� �Ǽ��� �Է¹ޱ�
����=����Ÿ�/�⸧��
 */

import java.util.*;
class InputTest3 
{
	public static void main(String[] args) 
	{
		double joo,hhh,money; //����Ÿ�, �ֹ�����,����

		Scanner in = new Scanner(System.in);

		System.out.println("����Ÿ��� ���ΰ���?");
			joo = in.nextDouble();
		System.out.println("����� �ֹ������� �󸶳� �ǳ���?");
			hhh = in.nextDouble(); 

			//����=����Ÿ�/�⸧��

		money = joo/hhh;

		System.out.println("�����" +money + "�Դϴ�");

		
		

	}
}
