//������ Ǭ ����. 
import java.util.Scanner;

class Pro02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a; // ���� ����
		int count = 0;
		String []one = {"������", "�����", "��Ÿ��", "�罺��"};
		String []two = {"������", "�����", "��Ÿ��", "�罺��"};
		String []three = {"������", "�����", "��Ÿ��", "�罺��"};
		String []four = {"������", "�����", "��Ÿ��", "�罺��"};
		String []five = {"������", "�����", "��Ÿ��", "�罺��"};
		String []six = {"������", "�����", "��Ÿ��", "�罺��"};
		String []seven = {"������", "�����", "��Ÿ��", "�罺��"};
		String []eight = {"������", "�����", "��Ÿ��", "�罺��"};
		String []nine = {"������", "�����", "��Ÿ��", "�罺��"};
		String []ten = {"������", "�����", "��Ÿ��", "�罺��"};
		for( int i = 1; i <= 10 ; i++ )
		{
			System.out.print( i + " �� ������ ������ �Է��ϼ���");
			a = sc.next();
			if( i == 1)
			{
				if(a.equals(one[0]))
				{
					System.out.println( "�����Դϴ�");
					count++;
				}
				else
				{
					System.out.println( "�����Դϴ�");
				}
			}


		if( i == 2)
			{
				if(a.equals(one[1]))
				{
					System.out.println( "�����Դϴ�");
					count++;
				}
				else
				{
					System.out.println( "�����Դϴ�");
				}
			}
			

		if( i == 3)
			{
				if(a.equals(one[2]))
				{
					System.out.println( "�����Դϴ�");
					count++;
				}
				else
				{
					System.out.println( "�����Դϴ�");
				}
			}
			

		if( i == 4)
			{
				if(a.equals(one[3]))
				{
					System.out.println( "�����Դϴ�");
					count++;
				}
				else
				{
					System.out.println( "�����Դϴ�");
				}
			}
			

		if( i == 5)
			{
			if(a.equals(one[0]))
				{
					System.out.println( "�����Դϴ�");
					count++;
				}
				else
				{
					System.out.println( "�����Դϴ�");
				}
			}
			

		if( i == 6)
			{
				if(a.equals(one[1]))
				{
					System.out.println( "�����Դϴ�");
					count++;
				}
				else
				{
					System.out.println( "�����Դϴ�");
				}
			}
			

		if( i == 7)
			{
				if(a.equals(one[2]))
				{
					System.out.println( "�����Դϴ�");
					count++;
				}
				else
				{
					System.out.println( "�����Դϴ�");
				}
			}
			

		if( i == 8)
			{
				if(a.equals(one[3]))
				{
					System.out.println( "�����Դϴ�");
					count++;
				}
				else
				{
					System.out.println( "�����Դϴ�");
				}
			}
			

		if( i == 9)
			{
			if(a.equals(one[0]))
			{
					System.out.println( "�����Դϴ�");
					count++;
				}
				else
				{
					System.out.println( "�����Դϴ�");
				}
			}
			

		if( i == 10)
			{
			if(a.equals(one[1]))
				{
					System.out.println( "�����Դϴ�");
					count++;
				}
				else
				{
					System.out.println( "�����Դϴ�");
				}
			}

		}

		if( count >=7)
		{
			System.out.println("�հ��Դϴ�");
		}
		else
		{
			System.out.println("���հ��Դϴ�");
		}

		System.out.println(" ���� Ƚ�� : " + count);
		System.out.println(" ���� Ƚ�� : " + (10 - count));
	}
}