//2) ����ڷ� ���� ������ �� N�� �Է¹޾� N�� �Ҽ����� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���.
import java.util.Scanner;
class  Two
{
	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);

		int n; //�Է¹޴� ��
		int b=0; //����� �����ϴ� ����
		

		System.out.print("������ �� N�� �Է��ϼ���==>");
		n = sc.nextInt();

		for (int i=1 ; i <=n ; i++)
		{
			if(n %i==0)
			b ++;
		}
		if(b==2) 
			//3�� 1,3 5�� 1,5 �̷������� �������� ������ ���� 2���ϱ� 2
			System.out.println(n+ "�� �Ҽ��Դϴ�");
		else
			System.out.println(n+ "�� �Ҽ��� �ƴմϴ� ");

			
	}
}