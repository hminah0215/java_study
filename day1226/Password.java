/*
	사용자한테 암호와 암호확인을 입력받아 
	서로 일치하는지 판별하는 프로그램을 작성합니다. 
	또 암호는 6자이상 10자이하로 제한하도록 합니다. 
	조건을 만족하는지 판별하여 적당한 메시지를 출력하도록 합니다. 
*/

import java.util.Scanner;
class  Password
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String pass,pass2;

		System.out.print("암호를 입력하세요(6~10자이하)==>");
		pass = sc.next();

		if( pass.length() < 6  ||  pass.length() > 10 ){
			System.out.println("암호는 6자이상 10자 이하로 입력해야합니다.");
			return;
		}

		System.out.print("암호를 다시 입력해주세요==>");
		pass2 = sc.next();
		
		if( pass.equals(pass2) ){
			System.out.println("암호가 일치합니다.");
			return;
		}else{
			System.out.println("암호가 일치하지 않습니다. 다시 확인해주세요!");
		}
	}
}
