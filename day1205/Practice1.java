/* 
연습) 사용자로부터 두개의 정수를 입력받아 나누기 한 결과를 출력하세요.
클래스명, 변수명 등은 자유롭게 하고 나누기 결과는 실수값으로 출력합니다.
*/

import java.util.Scanner;
class  Practice1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,b;
		double c;

		System.out.println("첫번째 정수를 입력하시오.");
		a = sc.nextInt();

		System.out.println("두번째 정수를 입력하시오.");
		b = sc.nextInt();
		
		c = a / (double)b;
		System.out.println("두 정수를 나누기 한 결과는 " + c + " 입니다");
	//	System.out.printf("%d /%d = %.1f", a,b,c");
	}
}
