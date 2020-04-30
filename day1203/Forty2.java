import java.util.Scanner;
import java.util.Date;



class Forty2{
	public static void main(String []args){
	
	int a;
	int b;
	Scanner sc = new Scanner (System.in);
	System.out.println("***무료 암검진 대상자 확인 ***");
	
	Date today = new Date();
	
	System.out.println("출생년도를 입력하세요====>");
	a = sc.nextInt();
	b = today.getYear()+1900-a;
	
	

	if( b >= 40 )
		System.out.println("무료 암검진 대상자입니다.");
	else
		System.out.println("무료 암검진 대상자가 아닙니다.");
}

	}