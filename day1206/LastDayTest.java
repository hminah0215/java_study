//LastDay ������Ǯ��
import java.util.Scanner;
class LastDayTest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int month;
		int lastday= 31;
		System.out.println("*������ �� Ȯ�� ���α׷�*");
		System.out.print("���� �Է��ϼ���===>");
		month=sc.nextInt();

		if( month <1 || month>12 )
		{
			System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
			return; //�޼ҵ带 �����ϼ���.��� ��
		}

		if(month ==2 )
				lastday=28;
		else if(month==4 || month==6 || month==9 || month==11)
				lastday=30;

		System.out.println(month+ "���� "+lastday +" �ϱ��� �־��!");
	

	}
}
