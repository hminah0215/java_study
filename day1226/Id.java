/*
	사용자한테 이메일을 입력받아 
	아이디만 추출하여 출력하는 프로그램 작성
	
	tiger@nate.com  
	tiger만 출력 

*/

import java.util.Scanner;
class  Id
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String email;

		System.out.print("이메일 주소를 입력하세요==>");
		email = sc.next();

		int n = email.indexOf("@");

		String id  = email.substring(0,n);
		System.out.println(id);
	}
}
