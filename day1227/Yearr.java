//��������� ������ �Է¹޾� �� �ذ� �������� �Ǻ��ϴ� ���α׷� 

import java.util.Scanner;
import java.util.GregorianCalendar;

class  Yearr
{
	public static void main(String[] args) 
	{
		GregorianCalendar gc = new GregorianCalendar();
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.print("������ ���ڷ� �Է��ϼ���==>");
		year = sc.nextInt();
		
		if(gc.isLeapYear(year)){
			System.out.println(year+"���� �����Դϴ�.");
		}else{
			System.out.println(year+"���� ������ �ƴմϴ�.");
		}
		
		


		


	}
}