//5�ϼ���. ���α׷��� 3�� Ȩ��ũ���� pro3
import java.util.Scanner;
class  SaleTest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int base = 100;
		int cnt, total;
		System.out.println("**100�� �����Դϴ�.**");
		System.out.print("���� ������ �Է��ϼ��� ==>");
		cnt=sc.nextInt();

		total = base*cnt;

		if( cnt>=10 ){
			total=(int)(total * 0.9);
			System.out.println("10���̻� �����Ͽ� 10%���εǾ����ϴ�.");
		}	
		System.out.print("��ü������ "+total+ " �� �Դϴ�.");

	}
}