//사용자한테 두개의 정수를 입력받아 그 중에 큰수를 찾아 출력하는 프로그램 작성
//클래스이름, 변수명등 자유
// 실행예 
//첫번째수를 입력하세요==>7
//두번째수를 입력하세요 ==> 7
//큰 수는 7입니다.


import java.util.Scanner;
class  Apple
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

			int a;
			int b;
			System.out.println("첫번째 수를 입력하세요 ==>");
				a =sc.nextInt();
			System.out.println("두번째 수를 입력하세요 ==>");
				b =sc.nextInt();

		if (a>b)
			System.out.println("큰 수는 " + a + " 입니다.");
		else
			System.out.println("큰 수는 " + b + " 입니다.");

		{
		}
	}
}
