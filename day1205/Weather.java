/* ��������� ���� �Է¹޾� �������� ����ϴ� ���α׷��� ���弼��. 
<<���࿹>>
���� �Է��ϼ���==> 7
7���� �����Դϴ�.
��:3,4,5 / ����:6,7,8 / ����:9,10,11 / �ܿ� 12,1,2
*/

import java.util.Scanner;
class  Weather
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("���� �Է��ϼ���. ==>");
		a=sc.nextInt();

		if( a>=3 && a<=5 )
			System.out.print("��");
		else if( a>=6 && a<=8 )
			System.out.print("����");
		else if( a>=9 && a<=11 )
			System.out.print("����");
		else if( a==12 || a==1 || a==2 )
			System.out.print("�ܿ�");
		else 
			System.out.print("�Է°��� 1~12�� ���̷� ���� ��");
	}
}
