/* 
����) ����ڷκ��� �ΰ��� ������ �Է¹޾� ������ �� ����� ����ϼ���.
Ŭ������, ������ ���� �����Ӱ� �ϰ� ������ ����� �Ǽ������� ����մϴ�.
*/

import java.util.Scanner;
class  Practice1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,b;
		double c;

		System.out.println("ù��° ������ �Է��Ͻÿ�.");
		a = sc.nextInt();

		System.out.println("�ι�° ������ �Է��Ͻÿ�.");
		b = sc.nextInt();
		
		c = a / (double)b;
		System.out.println("�� ������ ������ �� ����� " + c + " �Դϴ�");
	//	System.out.printf("%d /%d = %.1f", a,b,c");
	}
}