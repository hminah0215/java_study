/*
�ݺ��� ����) ��������� ������ �� N�� �Է¹޾� 1���� N������ ���� �����Ͽ� 
			 ����ϴ� ���α׷��� ����� ������.
<���࿹>
N�� �Է��ϼ���.==> 10
1���� 10������ ���� __ �Դϴ�. 
*/
import java.util.Scanner;
class ForTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n; //�Է¹޴°�
		int sum=0; //����� ���� ����, ���ϱ��ص� �ƹ� �����̾��� 0�� ������ �ش�.

		System.out.print("������ ���ұ��?");
		n = sc.nextInt();

		for(int i = 1 ; i <= n ; i++  )
		//�ǿ����� ��߰� ,��� ����(������)��, �������� ������ i�� �󸶾� �����ؾ��ϴ���
		//i=i+1 �� i++��� �Է��ص� ��.
		{
			sum = sum + i;  
		}
			System.out.println("1���� " +n+ " ������ ���� " +sum+ " �Դϴ�.");
	}

}
