/*
	��������� �̸����� �Է¹޾� 
	���̵� �����Ͽ� ����ϴ� ���α׷� �ۼ�
	
	tiger@nate.com  
	tiger�� ��� 

*/

import java.util.Scanner;
class  Id
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String email;

		System.out.print("�̸��� �ּҸ� �Է��ϼ���==>");
		email = sc.next();

		int n = email.indexOf("@");

		String id  = email.substring(0,n);
		System.out.println(id);
	}
}
