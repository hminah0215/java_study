/*
연습) 사용자한테 0~9사이의 정수를 입력받아 한글표기식 출력하는 프로그램을 만들어보세요.
<실행예>
0~9사이의 수를 입력하세요 ==>7
칠!
*/

/*
import java.util.Scanner;
class  Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("0~9 사이의 정수를 입력하시오. ==>");
		a=sc.nextInt();

		if( a==0 )
			System.out.print("영");
		
		else if( a==1 ){
			System.out.print("일");
		}
		else if( a==2 ){
			System.out.print("이");
		}
		else if( a==3 ){
			System.out.print("삼");
		}
		else if( a==4 ){
			System.out.print("사");
		}
		else if( a==5 ){
			System.out.print("오");
		}
		else if( a==6 ){
			System.out.print("육");
		}
		else if( a==7 ){
			System.out.print("칠");
		}
		else if( a==8 ){
			System.out.print("팔");
		}
		else if( a==9 ){
			System.out.print("구");
		}	
		
	}
}
*/


//선생님 풀이 

import java.util.Scanner;
class  Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		String r="";

		System.out.print("숫자를 입력하시오. ==>");
		n=sc.nextInt();
		
			if( n<0 || n>9){  //사용자가 입력한 값이 0~9사이일때를 아예 조건으로. 
			System.out.print("입력값을 확인하세요!");
			return;
		}
		
		

		if ( n==0 )
			r="영";
		
		else if ( n==1 )
			r="일";
		
		else if ( n==2 )
			r="이";
		
		else if ( n==3 )
			r="삼";
		else if ( n==4 )
			r="사";
		else if ( n==5 )
			r="오";

		System.out.print(r);
	
		}
		}
		
