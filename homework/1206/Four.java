/*4) ����� ���� ������ �߿� ����� ����Ұ����� �Է¹޾� 
	�ش� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
	<< ���� �� >>
	����� ����ұ��? 2
	2 * 1 = 2
	2 * 2 = 4
	...
	2 * 9 = 18
	*/
import java.util.Scanner;
class  Four
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n; //������� �Է¹��� ����
		System.out.println("������ ����� ����ұ��?");
		n=sc.nextInt();
		for(int i=1; i<=9; i++)
		{
			System.out.println(n+ "*"+ i+ "=" +n*i);
		}
	}
}