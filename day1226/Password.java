/*
	��������� ��ȣ�� ��ȣȮ���� �Է¹޾� 
	���� ��ġ�ϴ��� �Ǻ��ϴ� ���α׷��� �ۼ��մϴ�. 
	�� ��ȣ�� 6���̻� 10�����Ϸ� �����ϵ��� �մϴ�. 
	������ �����ϴ��� �Ǻ��Ͽ� ������ �޽����� ����ϵ��� �մϴ�. 
*/

import java.util.Scanner;
class  Password
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String pass,pass2;

		System.out.print("��ȣ�� �Է��ϼ���(6~10������)==>");
		pass = sc.next();

		if( pass.length() < 6  ||  pass.length() > 10 ){
			System.out.println("��ȣ�� 6���̻� 10�� ���Ϸ� �Է��ؾ��մϴ�.");
			return;
		}

		System.out.print("��ȣ�� �ٽ� �Է����ּ���==>");
		pass2 = sc.next();
		
		if( pass.equals(pass2) ){
			System.out.println("��ȣ�� ��ġ�մϴ�.");
			return;
		}else{
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� Ȯ�����ּ���!");
		}
	}
}