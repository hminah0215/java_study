/*
��������� n�� �Է¹޾� 1���� n������ 3�� ����� ��� ����Ͻÿ�.
*/

import java.util.Scanner;
class  ForTest06
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print(" N�� �Է��ϼ���==>");
		n=sc.nextInt();

		for(int i=1 ;  i<=n  ; i++)
			{
			if( i %3 == 0 ) {
			 System.out.println(i);
		    }
		}
	}
}
