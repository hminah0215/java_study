/*
3. ����� ���� ����, ������ �Է¹޾� ���ڸ��� ���Ͽ� ����ϴ� ���α׷��� ����� ���ϴ�.
	<< ���� �� >>
	�̸��� �����ΰ���? ȫ�浿
	����� �¾����? 3
	���Ͽ� �¾����? 15
	ȫ�浿���� ���ڸ��� ___�ڸ��Դϴ�.

	<< ó������ >>
	�����ڸ�	01/20 ~ 02/18
	������ڸ�	02/19 ~ 03/20
	���ڸ�	03/21 ~ 04/19
	Ȳ���ڸ�	04/20 ~ 05/20
	�ֵ����ڸ�	05/21 ~ 06/21
	���ڸ�	06/22 ~ 07/22
	�����ڸ�	07/23 ~ 08/22
	ó���ڸ�	08/23 ~ 09/23
	õĪ�ڸ�	09/24 ~ 10/22
	�����ڸ�	10/23 ~ 11/22
	����ڸ�	11/23 ~ 12/24
	�����ڸ�	12/25 ~ 01/19
*/
import java.util.Scanner;
class  Three
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String a;
		int b,c;
		
		System.out.print("�̸��� �����ΰ���? ==>");
		a=sc.next();
		System.out.print("ź������ �Է��ϼ���. ==>");
		b=sc.nextInt();
		System.out.print("ź������ �Է��ϼ���. ==>");
		c=sc.nextInt();

		if ( b==1 )
			if (c>=20 && c<=30)
			System.out.print(a+ "���� �����ڸ� �Դϴ�.");
			else if (c<=19)
			System.out.print(a+ "���� �����ڸ� �Դϴ�.");
			
		if ( b==2 )
			if (c>=1 && c<=18)
			System.out.print(a+ "���� �����ڸ� �Դϴ�.");
			else if (c>=19)
			System.out.print(a+ "���� ������ڸ� �Դϴ�.");
		
		if ( b==3 )
			if (c>=20)
			System.out.print(a+ "���� ������ڸ� �Դϴ�.");
			else if (c>=21 && c<=31)
			System.out.print(a+ "���� ���ڸ� �Դϴ�.");
			
		if ( b==4 )
			if (c>=19)
			System.out.print(a+ "���� ���ڸ� �Դϴ�.");
			else if (c>=20 && c<=30)
			System.out.print(a+ "���� Ȳ���ڸ� �Դϴ�.");
		
		if ( b==5 )
			if (c<=20)
			System.out.print(a+ "���� Ȳ���ڸ� �Դϴ�.");
			else if (c>=21 && c<=30)
			System.out.print(a+ "���� �ֵ����ڸ� �Դϴ�.");

		if ( b==6 )
			if (c<=21)
			System.out.print(a+ "���� �ֵ����ڸ� �Դϴ�.");
			else if (c>=22 && c<=30)
			System.out.print(a+ "���� ���ڸ� �Դϴ�.");
		
		if ( b==7 )
			if (c<=22)
			System.out.print(a+ "���� ���ڸ� �Դϴ�.");
			else if (c>=23 && c<=30)
			System.out.print(a+ "���� �����ڸ� �Դϴ�.");

		if ( b==8 )
			if (c<=22)
			System.out.print(a+ "���� �����ڸ� �Դϴ�.");
			else if (c>=23 && c<=30)
			System.out.print(a+ "���� ó���ڸ� �Դϴ�.");

		if ( b==9 )
			if (c<=23)
			System.out.print(a+ "���� ó���ڸ� �Դϴ�.");
			else if (c>=24 && c<=30)
			System.out.print(a+ "���� õĪ�ڸ� �Դϴ�.");

		if ( b==10)
			if (c<=22)
			System.out.print(a+ "���� õĪ�ڸ� �Դϴ�.");
			else if (c>=23 && c<=30)
			System.out.print(a+ "���� �����ڸ� �Դϴ�.");

		if ( b==11 )
			if (c<=22)
			System.out.print(a+ "���� �����ڸ� �Դϴ�.");
			else if (c>=23 && c<=30)
			System.out.print(a+ "���� ����ڸ� �Դϴ�.");

		if ( b==12 )
			if (c<=24)
			System.out.print(a+ "���� ����ڸ� �Դϴ�.");
			else if (c>=25 && c<=30)
			System.out.print(a+ "���� �����ڸ� �Դϴ�.");
			
			


	}
}
