/*3) ����ڷ� ���� N�� �Է¹޾� 1���� N������ ¦������, Ȧ���� ��, ¦���� ����, 
	Ȧ���� ������ ���� ���Ͽ� ����ϼ���. 
	
	��Ǯ����.
	
	*/
import java.util.Scanner;
class Three 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n; //�Է¹޴� ��
		int k=0;
		int q=0;
		int l=0;
		int div;
		System.out.print("������ �� N�� �Է��ϼ���==>");
		n = sc.nextInt();

			for (int i=1 ;i <= n ; i++ )
		{
				l=i %2; q=i %2;
			if(l==0){
				l=i;k++;
			}
			else if (q!=0)
				q=i;

			
		}
			System.out.println("¦���ǰ����� " +k +" Ȧ����" + q);
	}
}
