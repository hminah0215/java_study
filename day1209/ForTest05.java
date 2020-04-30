/*
	연습) for문을 이용하여 다음과 같이 동작하는 프로그램을 작성하세요. 

	<<실행 예>>
	별을 몇개 출력할까요? 5
	***** (가로로 출력)
*/

import java.util.Scanner;
class  ForTest05
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("별을 몇개 출력할까요?");
		n=sc.nextInt();

		for( int i=1  ; i <=n  ;  i++ ){
			System.out.print("*" + " ");
		}


	}
}
