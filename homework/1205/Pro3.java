/* �������� �ϳ��� 100���� ������ �Ǹ��ϰ� �ִٰ� ��������. 
������ 10���̻� �����ϴ� �����Դ� 10%�� �������شٰ�����. 
����ڰ� ������ ������ ������ �Է��ϸ� ��ü ������ �������� ������ִ� ���α׷��� 
�ۼ��϶�. �� ������ ������ 10�̻��̸� 10% ������ �������� ����ؾ��Ѵ�. 
if-else���� ����϶� */

import java.util.Scanner;
class Pro3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		double d;
		
		System.out.print("������ ������ ������ �Է��ϼ���. ==>");
		a=sc.nextInt();
		
		 b=100;
		 c=a*b;
		 d=(a*b)*0.9;
		
		if ( a>=10 )
			System.out.print("��ü ������ "+d+" �� �Դϴ�." );
		else 
			System.out.print("��ü ������ "+c+" �� �Դϴ�." );
	}
}
