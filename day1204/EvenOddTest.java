//��������� ������ �� N�� �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷��� �����
// <���࿹>
// ���� �Է��ϼ���==>4
//4�� ¦���Դϴ�. 

import java.util.Scanner;
class  EvenOddTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("���� �Է��ϼ���==>");
		n = sc.nextInt();

		if( n % 2 == 0 ) //n�� ¦������ ���� �� , ���̸� true �����̸� false
			System.out.println(n+ "�� ¦���Դϴ�.");
		else
			System.out.println(n+ "�� Ȧ���Դϴ�.");
			
	}
}
