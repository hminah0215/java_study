/*연습) 사용자 한테 3개의 정수를 입력받아 그중에 가장 큰수를 찾아 출력하는 
프로그램을 작성하세요. if문 공부중이니 삼항말고 if로 */

import java.util.Scanner;
class If02 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int a,b,c;

		System.out.println("첫번째 정수를 입력하세요.");
		a=sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		b=sc.nextInt();
		System.out.println("세번째 정수를 입력하세요.");
		c=sc.nextInt();
		

		if( a>b )
			if( a>c )
				System.out.println("가장 큰 수는 "+a+ " 입니다.");

			else 
				System.out.println("가장 큰 수는 "+c+ " 입니다.");
		
		else
			if( b>c )
				System.out.println("가장 큰 수는 "+b+ " 입니다.");
			
			else
				System.out.println("가장 큰 수는 "+c+ " 입니다.");

	}
}   




