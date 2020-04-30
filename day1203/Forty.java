import java.util.Scanner;


class Forty{
	public static void main(String []args){

	int age;
	Scanner sc = new Scanner (System.in);
	System.out.println("***무료 암검진 대상자 확인 ***");
	System.out.println("나이를 입력하세요====>");
	age = sc.nextInt();

	if( age >= 40 )
		System.out.println("무료 암검진 대상자입니다.");
	else
		System.out.println("무료 암검진 대상자가 아닙니다.");


}

	}