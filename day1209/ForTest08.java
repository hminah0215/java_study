/*
	사용자한테 n을 입력받아 n의 약수를 모두 출력하는 프로그램을 작성하세요.
	((실행예))
	n을 입력하시오==> 8
	1 2 4 8
*/

import java.util.Scanner;
class  ForTest08
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		int n;
		System.out.print("N을 입력하세요 ==> ");
		n=sc.nextInt();   

		for( int i=1 ;  i <= n ;  i++ ){
			if( n%i==0)
				System.out.println(i);
		}

				System.out.println("작업종료");
	}
}
