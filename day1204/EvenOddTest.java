//사용자한테 임의의 수 N을 입력받아 짝수인지 홀수인지 판별하는 프로그램을 만들기
// <실행예>
// 수를 입력하세요==>4
//4는 짝수입니다. 

import java.util.Scanner;
class  EvenOddTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("수를 입력하세요==>");
		n = sc.nextInt();

		if( n % 2 == 0 ) //n이 짝수인지 묻는 식 , 참이면 true 거짓이면 false
			System.out.println(n+ "은 짝수입니다.");
		else
			System.out.println(n+ "은 홀수입니다.");
			
	}
}
