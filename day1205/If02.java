/*����) ����� ���� 3���� ������ �Է¹޾� ���߿� ���� ū���� ã�� ����ϴ� 
���α׷��� �ۼ��ϼ���. if�� �������̴� ���׸��� if�� */

import java.util.Scanner;
class If02 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int a,b,c;

		System.out.println("ù��° ������ �Է��ϼ���.");
		a=sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		b=sc.nextInt();
		System.out.println("����° ������ �Է��ϼ���.");
		c=sc.nextInt();
		

		if( a>b )
			if( a>c )
				System.out.println("���� ū ���� "+a+ " �Դϴ�.");

			else 
				System.out.println("���� ū ���� "+c+ " �Դϴ�.");
		
		else
			if( b>c )
				System.out.println("���� ū ���� "+b+ " �Դϴ�.");
			
			else
				System.out.println("���� ū ���� "+c+ " �Դϴ�.");

	}
}   



