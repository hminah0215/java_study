/*
	��������� �ֹι�ȣ�� �Է¹޾� ���̸� ����Ͽ� ����մϴ�.
	������Ǯ��! ������ age�� 201x�⿡ �¾�ֵ��� ������ 
*/

import java.util.Scanner;
import java.util.Date;
class  AgeFromJumin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String jumin="";
		System.out.print("�ֹι�ȣ�� �Է��ϼ���==>");
		jumin = sc.next();
		
		int year = Integer.parseInt( jumin.substring(0,2) );
		year += 1900;

		int flag = Integer.parseInt( jumin.substring(7,8) );
		
		if( flag == 3 || flag == 4 || flag == 7 || flag == 8){
			year += 100;
		}
		int currentYear = (new Date()).getYear()+1900;
		int age = currentYear- year;
		System.out.println("����: "+ age);
		
	}
}
