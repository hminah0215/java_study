/*
	사용자한테 주민번호를 입력받아 나이를 계산하여 출력합니다.
	선생님풀이! 내가한 age는 201x년에 태어난애들은 계산못함 
*/

import java.util.Scanner;
import java.util.Date;
class  AgeFromJumin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String jumin="";
		System.out.print("주민번호를 입력하세요==>");
		jumin = sc.next();
		
		int year = Integer.parseInt( jumin.substring(0,2) );
		year += 1900;

		int flag = Integer.parseInt( jumin.substring(7,8) );
		
		if( flag == 3 || flag == 4 || flag == 7 || flag == 8){
			year += 100;
		}
		int currentYear = (new Date()).getYear()+1900;
		int age = currentYear- year;
		System.out.println("나이: "+ age);
		
	}
}
