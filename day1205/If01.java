//����) ��������� ������ ���� N�� �Է¹޾� �� ���� 0�� ������ ����̸� 
//		�� ���� 100�� ���Ѱ��� ����ϰ�"�۾�����"�� ����մϴ�. 
//		�׷��� �ʴٸ�, �� ���� ������ ����ϰ� "�۾�����"�� ����մϴ�. 

//���࿹) 
//������ �Է��ϼ��� ==> 5
//105
//�۾����� 

// ������ �Է��ϼ��� ==> -5
//25
//�۾����� 

/*import java.util.Scanner;
class  If01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

			int a;
			System.out.print("������ �Է��ϼ���===>");
			a=sc.nextInt();

			if (a>=0)
			{
				a=a+100;
				System.out.println(a);
				System.out.println("�۾�����");
				}
			else
			{			
				a=a*a;
				System.out.println(a);
				System.out.println("�۾�����");
			}
	}
}   */

// ������ Ǯ��

import java.util.Scanner;
class  If01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

			int n;
			System.out.print("N�� �Է� ==>");
			n = sc.nextInt();
		
		 if (n>=0)
			{
				System.out.println(n+100);
				
				}
			else
			{			
				System.out.println(n*n);
				
			}
			System.out.println("�۾�����"); //�۾������� �ȳ����� ������ �ѹ��� ��µǰ�.
	}
}


