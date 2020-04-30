//LastDay 선생님풀이
import java.util.Scanner;
class LastDayTest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int month;
		int lastday= 31;
		System.out.println("*마지막 날 확인 프로그램*");
		System.out.print("월을 입력하세요===>");
		month=sc.nextInt();

		if( month <1 || month>12 )
		{
			System.out.println("입력값이 잘못되었습니다.");
			return; //메소드를 종료하세요.라는 뜻
		}

		if(month ==2 )
				lastday=28;
		else if(month==4 || month==6 || month==9 || month==11)
				lastday=30;

		System.out.println(month+ "월은 "+lastday +" 일까지 있어요!");
	

	}
}
