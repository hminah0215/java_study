/* ��������� �ҹ��ڷ� �� ���ڿ��� �Է¹޾� �빮�ڷ� ��ȯ�ϴ� ���α׷� �ۼ�  */

import java.util.Scanner;

class  ToUpper
{
	public static void main(String[] args) 
	{
		char ch = ' ';
		System.out.println("|"+ch+"|");
		System.out.println("|"+(int)ch+"|");//������ �ڵ尪�� �˾ƺ��ڴ°� 

		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("***�ҹ��ڸ� �빮�ڷ� ��ȯ ***");
		System.out.println("�ҹ��� �ܾ �Է��ϼ���==>");
		str = sc.nextLine();//���鵵 �Է¹��� �� ����.
		//str = sc.next(); 
		//next�� �ϳ��� �ܾ �Է��Ҽ�����. ������ nextLine.

		for(int i=0;i<str.length();i=i+1)
		//������ i=0���ε�. ù��°�ڸ��� 0���Ͷ�� ��.
		//i�� 0���� �����ؼ� ���ڿ��� ���̺��� ���������� 
		//����°�� �������� ������ 
		{
			//�߰�ȣ �ϰ� for����? �ϰ� ������ �������.
			char a = str.charAt(i);
			System.out.print((char) (a-32) );//�ҹ��ڸ� �빮�ڷ� �ٲٷ��� -32
		}
	}
}