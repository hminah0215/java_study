/*
	연습) 다음과 같이 동작하는 프로그램을 작성합니다.
	<<실행 예>>
	줄수를 입력하세요 ==> 5
	*
	**
	***
	****
	*****

*/
import java.util.Scanner;
class  PrintStar02
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;

	 System.out.print("줄수를 입력하세요 ==>  ");
    	n=sc.nextInt();

		for( int i=1 ; i <= n ; i++ ){
			for( int j=1 ; j <= i ; j++){
			System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
