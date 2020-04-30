/*
	사용자한테 또!!!! 주민번호를 입력받아 나이를 계산하여 출력합니다.
*/

import java.util.Scanner;
class  Age
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String jumin="";

		System.out.print("주민번호를 입력하세요==>");
		jumin = sc.next();

		int n = Integer.parseInt( jumin.substring(0,2)); //91년생
		int x = Integer.parseInt( jumin.substring(0,1)); //2000년대생은 앞자리가 0인지만 판별하면 됨

		
		int z = 2019 - (n+1900) +1;
		
			if( x == 0  ){
				z = 2019 - (n+2000) +1;
		}
		System.out.print(z + "살 입니다.");
	}
}
