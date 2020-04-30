/* 사용자한테 월을 입력받아 계절명을 출력하는 프로그램을 만드세요. 
<<실행예>>
월을 입력하세요==> 7
7월은 여름입니다.
봄:3,4,5 / 여름:6,7,8 / 가을:9,10,11 / 겨울 12,1,2
*/

import java.util.Scanner;
class  Weather
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("월을 입력하세요. ==>");
		a=sc.nextInt();

		if( a>=3 && a<=5 )
			System.out.print("봄");
		else if( a>=6 && a<=8 )
			System.out.print("여름");
		else if( a>=9 && a<=11 )
			System.out.print("가을");
		else if( a==12 || a==1 || a==2 )
			System.out.print("겨울");
		else 
			System.out.print("입력값은 1~12월 사이로 적을 것");
	}
}
