//1) ����ڷ� ���� ������ �� N�� �Է¹޾� N�� ����� ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
import java.util.Scanner;
class  One
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int n; //�Է¹޴� ��
		int div=1; //����� �����ϴ� ����

		System.out.print("������ �� N�� �Է��ϼ���==>");
		n = sc.nextInt();

		for (int i=n ;i >= 1 ; i-- )
		{
			div =n %i; //�������� ���ϴ°Ű�.
		if(div==0) //�������� 0�̸� ���
			System.out.println(i);
		}


	}
}
