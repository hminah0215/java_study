/*
	����) ��������� ������ �� N�� �Է¹޾� N!�� ���Ͽ� ����ϴ� ���α׷��� �ۼ��ϰ�
		�����غ��ϴ�.
	
	<���� ��>
	N�� �Է��ϼ���==> 5
	5*4*3*2*1=___ /���ؼ� �����ϴ°� ! .
*/

import java.util.Scanner;
class  ForTest03
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n; //�Է¹޴� ��
		int sum=1; //����� �����ϴ� ����

		System.out.print("������ �� N�� �Է��ϼ���==>");
		n = sc.nextInt();

		for(int i = n ; i >= 1 ; i--  )
		
		{
			sum = sum*i;
			System.out.print(i);
			if(i != 1)
				System.out.print("*");
		}
			System.out.println("= " +sum+ " �Դϴ�.");
	}

}

	

