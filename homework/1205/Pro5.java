
import java.util.Scanner;
class Pro5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int a;

		System.out.println("1���� 10 ������ ��ȣ�� �����ÿ�.");
		a=sc.nextInt();

		if (a==2)
			System.out.println("1�� �Դϴ�.");
		else if( a==5 ) 
			System.out.println("2�� �Դϴ�.");
		else if( a==7 ) 
			System.out.println("3�� �Դϴ�.");
		
		else 
			System.out.println("�� ������ȸ��.");
	}
}
