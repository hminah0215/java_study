/*
��ǻ�Ϳ� ����ڰ��� ����,����,�� ������ ���� ���α׷��� ������� �մϴ�. 
��������� 0,1,2(����,����,��)�� �Է¹޾� "����","����","��"�� ����ϼ���.
<���࿹>
����[0],����[1],��[2] �߿� �����ϼ���==? 1
����� "����"�� ���̽��ϴ�.
*/

import java.util.Scanner;
import java.util.Random; //��������, ����
class	SwitchP01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		
		int user,com;
		String userStr="",comStr="";

		//����ڿ��� �Է¹ޱ����� ���� ��ǻ�Ͱ� �غ��ϰ� ���� �� �ֵ���
		com = rand.nextInt(3); //0���� 2���� �߿� �������� ��ǻ�Ͱ� ������.
		//System.out.println(com);
		
		
		System.out.println("*** ����,����,�� ���� ***");
		System.out.print("����[0],����[1],��[2] �߿� �����ϼ���==>");
		user=sc.nextInt();

		if(user < 0 || user > 2)
		{
			System.out.println("�Է°��� Ȯ���ϼ���!");
			return; //������ ���ڸ� �Է������� �ƿ� ����ġ�� ������ �ʰ��Ϸ���.
		}
		switch(user)
		{
			case 0:userStr = "����";break;
			case 1:userStr = "����";break;
			case 2:userStr = "��";break;
			

		}
		System.out.println("����� "+userStr+ " �� �½��ϴ�.");
		
		switch(com)//��ǻ�Ͱ� ���� �޽��� ���
		{
			case 0:comStr = "����";break;
			case 1:comStr = "����";break;
			case 2:comStr = "��";break;
			

		}
		System.out.println("��ǻ�ʹ� "+comStr+ " �� �½��ϴ�.");

		/*��ǻ�Ͱ� �̰����,����ڰ� �̰����, ������ �Ǵ��Ͽ�
		 ���Ӱ���� ����ϵ��� ����� �߰��غ�����. */
		
		/* �����Ѱ�
	
			if( user==com )
			System.out.println("�����ϴ�.");
		
			else if( user == 0 )
			{
		 		 if( com == 1)
				System.out.println("����ڰ� �����ϴ�.");
				else if( com == 2)
				System.out.println("����ڰ� �̰���ϴ�.");
			}

			 else if( user == 1 )
			{
				if( com == 0 )
				System.out.println("����ڰ� �̰���ϴ�.");
				else if( com == 2)
				System.out.println("����ڰ� �����ϴ�.");
			}
			 
				else if( user == 2 )
				{
					if( com == 0 )
				System.out.println("����ڰ� �����ϴ�.");
		 			else if( com == 1)
				System.out.println("����ڰ� �̰���ϴ�.");
				
				}
				
			*/

		if( com==user )
		{	
		System.out.println("�����ϴ�.");
		}	else if((user ==0 && com==2) || (user ==1 && com==0)|| (user==2 && com==1))
				System.out.println("����� �̰���ϴ�.");
		    else {
				System.out.println("����� �����ϴ�.");}
	}
}

 