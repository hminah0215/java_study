//사용자한테 연도를 입력받아 그 해가 윤년인지 판별하는 프로그램 

import java.util.Scanner;
import java.util.GregorianCalendar;

class  Yearr
{
	public static void main(String[] args) 
	{
		GregorianCalendar gc = new GregorianCalendar();
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.print("연도를 숫자로 입력하세요==>");
		year = sc.nextInt();
		
		if(gc.isLeapYear(year)){
			System.out.println(year+"년은 윤년입니다.");
		}else{
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
		
		


		


	}
}
