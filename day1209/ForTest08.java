/*
	��������� n�� �Է¹޾� n�� ����� ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
	((���࿹))
	n�� �Է��Ͻÿ�==> 8
	1 2 4 8
*/

import java.util.Scanner;
class  ForTest08
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		int n;
		System.out.print("N�� �Է��ϼ��� ==> ");
		n=sc.nextInt();   

		for( int i=1 ;  i <= n ;  i++ ){
			if( n%i==0)
				System.out.println(i);
		}

				System.out.println("�۾�����");
	}
}