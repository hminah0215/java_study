import java.util.Scanner;
import java.util.Date;

class CurrentAge{
	public static void main(String []args){
	
	Date today = new Date();
	int thisYear = today.getYear()+1900;
	
	Scanner sc = new Scanner(System.in);
	int birthYear;
	
	System.out.println("출생년도를 입력하세요.");
	birthYear = sc.nextInt();

	System.out.println("당신의 나이는 "+ (thisYear-birthYear)+ "살 입니다.");



	}
}