/* 5�� ����, 6�� �����ð��� ����ġ�� �ٽ� 
3. ����� ���� ����, ������ �Է¹޾� ���ڸ��� ���Ͽ� ����ϴ� ���α׷��� ����� ���ϴ�.
	<< ���� �� >>
	�̸��� �����ΰ���? ȫ�浿
	����� �¾����? 3
	���Ͽ� �¾����? 15
	ȫ�浿���� ���ڸ��� ___�ڸ��Դϴ�.

	<< ó������ >>
	�����ڸ�	01/20 ~ 02/18	������ڸ�	02/19 ~ 03/20
	���ڸ�	    03/21 ~ 04/19	Ȳ���ڸ�	04/20 ~ 05/20
	�ֵ����ڸ�	05/21 ~ 06/21	���ڸ�	    06/22 ~ 07/22
	�����ڸ�	07/23 ~ 08/22	ó���ڸ�	08/23 ~ 09/23
	õĪ�ڸ�	09/24 ~ 10/22	�����ڸ�	10/23 ~ 11/22
	����ڸ�	11/23 ~ 12/24	�����ڸ�	12/25 ~ 01/19
*/

import java.util.Scanner;
class  Star
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int mon,day;
		String x;

		System.out.print("�̸��� �����ΰ���? ==>");
		x=sc.next();
		System.out.print("ź������ �Է��ϼ���. ==>");
		mon=sc.nextInt();
		
		if(mon < 1 || mon > 12)
		{
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			return; 
		}
		
		int lastday = 31;

		switch(mon)
		{
			case 2:lastday=28;break;
			case 4:case 6:case 9:case 11:lastday=30;break;
			default:lastday=31;
		}
		
		System.out.print("���Ͽ� �¾����?");
		day=sc.nextInt();
		if(day < 1 || day > lastday)
		{
			System.out.println(mon + "���� " + lastday+ " �ϱ��� �־��!");
			return; 
		}
		
		System.out.print("ź������ �Է��ϼ���. ==>");
		day=sc.nextInt();
		

		switch (mon)
		{
		
		case 1:if(day >=20 && day<=30)System.out.print(x+ "���� �����ڸ� �Դϴ�.");
		       else if(day<=19)System.out.print(x+ "���� �����ڸ� �Դϴ�.");break;
		
		case 2:if(day >=1 && day<=18)System.out.print(x+ "���� �����ڸ� �Դϴ�.");
		       else if(day>=19)System.out.print(x+ "���� ������ڸ� �Դϴ�.");break;
			   
		case 3:if(day >=21 && day<=31)System.out.print(x+ "���� ������ڸ� �Դϴ�.");
		       else if(day>=20)System.out.print(x+ "���� ���ڸ� �Դϴ�.");break;	  
		
		case 4:if(day>=19)System.out.print(x+ "���� ���ڸ� �Դϴ�.");
		       else if(day >=20 && day<=30)System.out.print(x+ "���� Ȳ���ڸ� �Դϴ�.");break;
 
	    case 5:if(day<=20)System.out.print(x+ "���� Ȳ���ڸ� �Դϴ�.");
		       else if(day >=21 && day<=31)System.out.print(x+ "���� �ֵ����ڸ� �Դϴ�.");break;

		case 6:if(day<=21)System.out.print(x+ "���� �ֵ����ڸ� �Դϴ�.");
		       else if(day >=22 && day<=30)System.out.print(x+ "���� �ֵ����ڸ� �Դϴ�.");break;
		
		case 7:if(day<=22)System.out.print(x+ "���� ���ڸ� �Դϴ�.");
		       else if(day >=23 && day<=31)System.out.print(x+ "���� �����ڸ� �Դϴ�.");break;
		
		case 8:if(day<=22)System.out.print(x+ "���� �����ڸ� �Դϴ�.");
		       else if(day >=23 && day<=30)System.out.print(x+ "���� ó���ڸ� �Դϴ�.");break;

		case 9:if(day<=23)System.out.print(x+ "���� ó���ڸ� �Դϴ�.");
		       else if(day >=24 && day<=30)System.out.print(x+ "���� õĪ�ڸ� �Դϴ�.");break;

		case 10:if(day<=22)System.out.print(x+ "���� õĪ�ڸ� �Դϴ�.");
		       else if(day >=23 && day<=30)System.out.print(x+ "���� �����ڸ� �Դϴ�.");break;

		case 11:if(day<=22)System.out.print(x+ "���� �����ڸ� �Դϴ�.");
		       else if(day >=23 && day<=30)System.out.print(x+ "���� ����ڸ� �Դϴ�.");break;

		case 12:if(day<=24)System.out.print(x+ "���� ����ڸ� �Դϴ�.");
		       else if(day >=25 && day<=31)System.out.print(x+ "���� �����ڸ� �Դϴ�.");break;
		}
		
	}
}
