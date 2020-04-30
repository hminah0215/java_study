/* 연습
어떤 사람의 출생연도를 입력받아 그사람이 무료 암검진 대상자인지 판별하는 프로그램 작성!
<<처리조건>> 나이가 40살 이상이고, 출생연도가 홀수연도인 사람이 무료 암 검진 대상자입니다.
*/

import java.util.Scanner;
import java.util.Date;
class  Cancer
{
	public static void main(String[] args) 
	{
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("**무료 암 검진 대상자 확인**");
		
		Date today= new Date();

		System.out.println("출생연도를 입력하세요 ===>");
		a = sc.nextInt();
		b = today.getYear()+1900-a;

		if ( b >=40 && a %2 ==1 ) //조건 둘다 만족해야함 &&, 짝수면0 홀수면1
			System.out.println("무료 암검진 대상자입니다.");
	    else
		    System.out.println("무료 암검진 대상자가 아닙니다.");
		{
		}


	}
}
