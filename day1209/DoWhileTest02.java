/*
	����) ��������� N�� �Է¹޾� 1~N������ ¦���� ���� �����Ͽ� ����ϴ� ���α׷�.
	Do~ while���� �̿��մϴ�. 
*/
import java.util.Scanner;
class DoWhileTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;
		int sum=0;
		System.out.print("N�� �Է��ϼ���===>");
		n=sc.nextInt();
		
		int i=1;
		do{
				if( i %2==0 )
				sum = sum+i;
				i++;
		}while( i <= n );

		System.out.println("1���� " +n+ "������ ¦����:" + sum);
	}
}