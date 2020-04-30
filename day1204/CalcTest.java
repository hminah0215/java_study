/*사용자 한테 두개의 정수를 입력받아 사칙연산을
수행한 결과를 출력하는 프로그램을 작성하시오 

<<실행예>> 
첫번째수를 입력하세요:5
두번째 수를 입력하세요:2
5+2=_
5-2=_
5*2=_
5/2=_
*/

import java.util.Scanner;
class CalcTest
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int a,b,add,sub,mul;
	double div;
	System.out.println("첫번째 수를 입력하세요.");
	a = sc.nextInt();
	System.out.println("두번째 수를 입력하세요.");
	b = sc.nextInt();

	//a+b=add; 이런거 자바에서 안됨.
	//결과가 아니라 =이 대등이니까 add = a+b 이렇게!
		add = a+b;
		sub = a-b;
		mul = a*b;
		div = a/(double)b; //둘다 정수니 하나를 더블로바꾸면 됨 둘다도 오키

			System.out.printf("%d + %d = %d\n ",a,b,add ); 
			//foam 형식에 맞춰 출력해줘
			//%d (형식지정문자 중 d 정수 f 실수) 정수로 출력해줘 
			//%d,a에 대응 뒤에건 b....
			//System.out.println(a+"+"b+'="+add);

			System.out.printf("%d - %d = %d\n ",a,b,sub );
			System.out.printf("%d * %d = %d\n ",a,b,mul );
			
		//5나누기2가 2.5가 나올수 있게 
			System.out.printf("%d / %d = %.3f\n ",a,b,div );
						//소수점 3번째자리까지 나오게 %다음 . 숫자
		// \n(계행문자?)이 줄바꿈!println이 아니라서 넣어줘야함.
		//System.out.println(a + "+"+b + "="+ add); 이런식으로도 가능
	}
}
