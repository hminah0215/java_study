/*
	��������� ��!!!! �ֹι�ȣ�� �Է¹޾� ���̸� ����Ͽ� ����մϴ�.
*/

import java.util.Scanner;
class  Age
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String jumin="";

		System.out.print("�ֹι�ȣ�� �Է��ϼ���==>");
		jumin = sc.next();

		int n = Integer.parseInt( jumin.substring(0,2)); //91���
		int x = Integer.parseInt( jumin.substring(0,1)); //2000������ ���ڸ��� 0������ �Ǻ��ϸ� ��

		
		int z = 2019 - (n+1900) +1;
		
			if( x == 0  ){
				z = 2019 - (n+2000) +1;
		}
		System.out.print(z + "�� �Դϴ�.");
	}
}
