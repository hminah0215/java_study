/*  ���ذ� Ȧ���⵵�̸� Ȧ���⵵�� �¾���, ���ذ� ¦���⵵�̸� ¦���⵵�� �¾�����
����ϰ��� ����ڰ� �ǵ��� �ڵ带 �����ϼ���.  */

import java.util.Scanner;
import java.util.Date;

class Cancertest3
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Date today= new Date();
		int thisYear = today.getYear()+1900;

		System.out.println("���ش� "+ thisYear);
		int birthYear,age;
		String result;
		
		System.out.println("**���� �� ���� ����� �Ǻ� ���α׷�**");
		System.out.print("��������� �Է��ϼ��� ===>");
		birthYear = sc.nextInt();
		age = thisYear - birthYear;

		if ( thisYear %2 == 1 )
		{
			if ( age >=40 && birthYear %2 !=0 ) 
			result = "���� �ϰ��� ������Դϴ�.";
			
	   else
			result = "���� �ϰ��� ����ڰ� �ƴմϴ�.";
		}
		
		else
		{
		
		if ( age >=40 && birthYear %2 ==0 ) 
			result = "���� �ϰ��� ������Դϴ�.";
			
	   else
			result = "���� �ϰ��� ����ڰ� �ƴմϴ�.";
		}

	   System.out.println(result);
		{
		}


	}
}