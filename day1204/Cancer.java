/* ����
� ����� ��������� �Է¹޾� �׻���� ���� �ϰ��� ��������� �Ǻ��ϴ� ���α׷� �ۼ�!
<<ó������>> ���̰� 40�� �̻��̰�, ��������� Ȧ�������� ����� ���� �� ���� ������Դϴ�.
*/

import java.util.Scanner;
import java.util.Date;
class  Cancer
{
	public static void main(String[] args) 
	{
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("**���� �� ���� ����� Ȯ��**");
		
		Date today= new Date();

		System.out.println("��������� �Է��ϼ��� ===>");
		a = sc.nextInt();
		b = today.getYear()+1900-a;

		if ( b >=40 && a %2 ==1 ) //���� �Ѵ� �����ؾ��� &&, ¦����0 Ȧ����1
			System.out.println("���� �ϰ��� ������Դϴ�.");
	    else
		    System.out.println("���� �ϰ��� ����ڰ� �ƴմϴ�.");
		{
		}


	}
}
