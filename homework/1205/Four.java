// 사용자에게 0~99 사이의 수를 입력받아 한글표기식을 출력하는 프로그램을 작성해봅시다

import java.util.Scanner;
class  Four
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ten,one;

		String tenk = "";
		String onek = "";
		
		System.out.print("십의 자리수를 입력하세요==>");
		ten = sc.nextInt();
		System.out.print("일의 자리수를 입력하세요==>");
		one = sc.nextInt();

		if( ten ==1 )
			tenk = "십";
		else if ( ten ==2 )
			tenk = "이십";
		else if ( ten ==3 )
			tenk = "삼십";
		else if ( ten ==4 )
			tenk = "사십";
		else if ( ten ==5 )
			tenk = "오십";
		else if ( ten ==6 )
			tenk = "육십";
		else if ( ten ==7 )
			tenk = "칠십";
		else if ( ten ==8 )
			tenk = "팔십";
		else if ( ten ==9 )
			tenk = "구십";

		if ( one ==1 )
			onek = "일";
		else if ( one==2 )
			onek = "이";
		else if ( one==3 )
			onek = "삼";
		else if ( one==4 )
			onek = "사";
		else if ( one==5 )
			onek = "오";
		else if ( one==6 )
			onek = "육";
		else if ( one==7 )
			onek = "칠";
		else if ( one==8 )
			onek = "팔";
		else if ( one==9 )
			onek = "구";
		else  ( one==0 )
			onek = "영";

		System.out.println(tenk+onek);


	}
}
