/*
3. 사용자 한테 생월, 생일을 입력받아 별자리를 구하여 출력하는 프로그램을 만들어 봅니다.
	<< 실행 예 >>
	이름은 무엇인가요? 홍길동
	몇월에 태어났나요? 3
	몇일에 태어났나요? 15
	홍길동님의 별자리는 ___자리입니다.

	<< 처리조건 >>
	물병자리	01/20 ~ 02/18
	물고기자리	02/19 ~ 03/20
	양자리	03/21 ~ 04/19
	황소자리	04/20 ~ 05/20
	쌍둥이자리	05/21 ~ 06/21
	게자리	06/22 ~ 07/22
	사자자리	07/23 ~ 08/22
	처녀자리	08/23 ~ 09/23
	천칭자리	09/24 ~ 10/22
	전갈자리	10/23 ~ 11/22
	사수자리	11/23 ~ 12/24
	염소자리	12/25 ~ 01/19
*/
import java.util.Scanner;
class  Three
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String a;
		int b,c;
		
		System.out.print("이름은 무엇인가요? ==>");
		a=sc.next();
		System.out.print("탄생월을 입력하세요. ==>");
		b=sc.nextInt();
		System.out.print("탄생일을 입력하세요. ==>");
		c=sc.nextInt();

		if ( b==1 )
			if (c>=20 && c<=30)
			System.out.print(a+ "님은 물병자리 입니다.");
			else if (c<=19)
			System.out.print(a+ "님은 염소자리 입니다.");
			
		if ( b==2 )
			if (c>=1 && c<=18)
			System.out.print(a+ "님은 물병자리 입니다.");
			else if (c>=19)
			System.out.print(a+ "님은 물고기자리 입니다.");
		
		if ( b==3 )
			if (c>=20)
			System.out.print(a+ "님은 물고기자리 입니다.");
			else if (c>=21 && c<=31)
			System.out.print(a+ "님은 양자리 입니다.");
			
		if ( b==4 )
			if (c>=19)
			System.out.print(a+ "님은 양자리 입니다.");
			else if (c>=20 && c<=30)
			System.out.print(a+ "님은 황소자리 입니다.");
		
		if ( b==5 )
			if (c<=20)
			System.out.print(a+ "님은 황소자리 입니다.");
			else if (c>=21 && c<=30)
			System.out.print(a+ "님은 쌍둥이자리 입니다.");

		if ( b==6 )
			if (c<=21)
			System.out.print(a+ "님은 쌍둥이자리 입니다.");
			else if (c>=22 && c<=30)
			System.out.print(a+ "님은 게자리 입니다.");
		
		if ( b==7 )
			if (c<=22)
			System.out.print(a+ "님은 게자리 입니다.");
			else if (c>=23 && c<=30)
			System.out.print(a+ "님은 사자자리 입니다.");

		if ( b==8 )
			if (c<=22)
			System.out.print(a+ "님은 사자자리 입니다.");
			else if (c>=23 && c<=30)
			System.out.print(a+ "님은 처녀자리 입니다.");

		if ( b==9 )
			if (c<=23)
			System.out.print(a+ "님은 처녀자리 입니다.");
			else if (c>=24 && c<=30)
			System.out.print(a+ "님은 천칭자리 입니다.");

		if ( b==10)
			if (c<=22)
			System.out.print(a+ "님은 천칭자리 입니다.");
			else if (c>=23 && c<=30)
			System.out.print(a+ "님은 전갈자리 입니다.");

		if ( b==11 )
			if (c<=22)
			System.out.print(a+ "님은 전갈자리 입니다.");
			else if (c>=23 && c<=30)
			System.out.print(a+ "님은 사수자리 입니다.");

		if ( b==12 )
			if (c<=24)
			System.out.print(a+ "님은 사수자리 입니다.");
			else if (c>=25 && c<=30)
			System.out.print(a+ "님은 염소자리 입니다.");
			
			


	}
}
