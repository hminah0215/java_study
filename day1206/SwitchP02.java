/*
��������� ���� �Է¹޾� ���������� ����ϴ� ���α׷��� switch�� ����Ͽ� �ۼ��մϴ�.
<���࿹> 
���� �Է��ϼ���==> 4
4���� 30�ϱ��� �־��.
*/

import java.util.Scanner;
class  SwitchP02 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int month,day;
		
		System.out.println("*** ������ �� Ȯ�� ***");
		System.out.print("���� �Է��ϼ���===>");
		month=sc.nextInt();

		if(month < 1 || month > 12)
		{
			System.out.println("�Է°��� Ȯ���ϼ���!");
			return; 
		}

		

		switch(month)
		{
			case 2:day=28;break;
			case 4:case 6:case 9:case 11:day=30;break;
			default:day=31;
			//���� �� ����� �ּ��޾Ƴ���.
			//case 4:day="30��";break;
			//case 6:day="30��";break;
			//case 9:day="30��";break;
			//case 11:day="30��";break;
			//case 2:day="28��";break;
			
		}

		System.out.println(month+ "���� "+day +"�� ���� �־��!");

	}
}