import java.util.Scanner;
import java.util.Date;

class Cancertest4
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Date today= new Date();
		int thisYear = today.getYear()+1900;
		int birthYear,age;
		String result;
		
		System.out.println("**���� �� ���� ����� �Ǻ� ���α׷�**");
		System.out.print("��������� �Է��ϼ��� ===>");
		birthYear = sc.nextInt();
		age = thisYear - birthYear;

		if ( age >=40 && birthYear %2 == thisYear % 2 ) 
			result = "���� �ϰ��� ������Դϴ�.";
			
	   else
			result = "���� �ϰ��� ����ڰ� �ƴմϴ�.";

	   System.out.println(result);
		{
		}


	}
}