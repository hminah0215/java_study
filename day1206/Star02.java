//���ڸ� ����ġ ������Ǯ��
import java.util.Scanner;
 class  Star02
 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int month,day;
		String name,star="";
		System.out.println("*** ���ڸ� �Ǻ� ***");
		System.out.print("�̸��� �Է��ϼ���===>");
		name=sc.nextLine();
		System.out.print("����� �¾����?");
		month=sc.nextInt();
		if(month < 1 || month > 12)
		{
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			return; 
		}
		
		int lastday = 31;

		switch(month)
		{
			case 2:lastday=28;break;
			case 4:case 6:case 9:case 11:lastday=30;break;
			default:lastday=31;
		}
		
		System.out.print("���Ͽ� �¾����?");
		day=sc.nextInt();
		if(day < 1 || day > lastday)
		{
			System.out.println(month + "���� " + lastday+ " �ϱ��� �־��!");
			return; 
		}
	
		switch(month){
			
			case 1:if( day <= 19 )star="�����ڸ�";else star="�����ڸ�";break;
			case 2:if( day <= 18 )star="�����ڸ�";else star="�������ڸ�";break;
			case 3:if( day <= 20 )star="�������ڸ�";else star="���ڸ�";break;
			case 4:if( day <= 19 )star="���ڸ�";else star="Ȳ���ڸ�";break;
			case 5:if( day <= 20 )star="Ȳ���ڸ�";else star="�ֵ����ڸ�";break;
			case 6:if( day <= 21 )star="�ֵ����ڸ�";else star="���ڸ�";break;
			case 7:if( day <= 22 )star="���ڸ�";else star="�����ڸ�";break;
			case 8:if( day <= 22 )star="�����ڸ�";else star="ó���ڸ�";break;
			case 9:if( day <= 23 )star="ó���ڸ�";else star="õĪ�ڸ�";break;
			case 10:if( day <=22 )star="õĪ�ڸ�";else star="�����ڸ�";break;
			case 11:if( day <= 22 )star="�����ڸ�";else star="����ڸ�";break;
			case 12:if( day <= 24 )star="����ڸ�";else star="�����ڸ�";break;
			
			
		}
		System.out.println(name+ "���� ���ڸ��� "+star+ " �Դϴ�.");
	}

 }