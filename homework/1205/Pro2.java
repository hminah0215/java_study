/* 사용자로부터 하나의 문자를 입력받아서 문자가 'R'이면 사각형의 면적을 계산하고 
'T'이면 삼각형의 면적을, 'C'이면 원의 면적을 계산한다. 면적을 계산하는데
필요한 숫자들은 사용자로부터 입력받는다. 

사각형 면적= 밑변길이 * 높이
삼각형 면적= 밑변길이 * 높이 /2
원의 면적 = 원주율 * 지름 * 지름 /4
*/

import java.util.Scanner;
class Pro2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a;
		int l,h,d; //밑변길이, 높이, 지름
		double c;
		
		
		System.out.print("하나의 문자를 입력하시오. ==>");
		a=sc.next();
		
		System.out.print("밑변의 길이를 입력하시오. ==>");
		l=sc.nextInt();
		
		System.out.print("높이를 입력하시오. ==>");
		h=sc.nextInt();

		System.out.print("지름을 입력하시오. ==>");
		d=sc.nextInt();
		
		
		 if ( a.equal("R") ){
			c=l*h;
		}
		
		
		System.out.print("사각형의 면적은 " +c+ " 입니다." );

		
	
		
		
		
			}
}
