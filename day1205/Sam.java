/*
����) ��������� �ΰ��� ������ �Է¹޾� ���߿� ū���� ã�� ����ϴ� ���α׷� �ۼ�
	   ��, ���⿬���ڸ� �̿��մϴ�.
*/

/*import java.util.Scanner;
class  Sam
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;

		System.out.println("ù��° ������ �Է��ϼ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		b = sc.nextInt();

		System.out.println((a>b)?+a+"�� �� ū �� �Դϴ�.":+b+"�� �� ū �� �Դϴ�.");
	}
} */

//������ Ǯ��
import java.util.Scanner;
class  Sam
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,max;

		System.out.println("ù��° ������ �Է��ϼ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		b = sc.nextInt();
		
		max = (a>b)?a:b;
		System.out.println("ū ���� " + max);		
	}
}
		