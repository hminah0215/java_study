/*
	���������  �����Ǽ� N�� �Է¹޾� �� ���� �Ҽ����� �Ǻ��ϴ� ���α׷��� �ۼ�

	<<���� ��>>
	N�� �Է��ϼ��� ==> 7
	7�� �Ҽ��Դϴ�. 

	<<�Ҽ�>>
	����� ���� 2���� ���� �Ҽ��� �Ѵ�. 1�� �ڱ��ڽ����θ� ���������� ��
*/


import java.util.Scanner;
class  ForTest09
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,cnt = 0;
		System.out.print("N�� �Է��ϼ���===>");
		n=sc.nextInt();

		for(int i=1; i <=n  ; i++ ){
			if( n %i == 0)
				cnt=cnt+1;		
		}
				if (cnt == 2) //1�� �ڱ��ڽ� 2���θ� �������� �Ҽ��ϱ�.
					System.out.println(n + "�� �Ҽ��Դϴ�.");
				else
					System.out.println(n + "�� �Ҽ��� �ƴմϴ�.");
	}
}
