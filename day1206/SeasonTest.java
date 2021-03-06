//사용자한테 월을 입력받아 계절명 출력(어제 웨더파일)
import java.util.Scanner;
class SeasonTest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int month;
		System.out.println("***계절명 확인 프로그램***");
		System.out.print("월을 입력하세요.===>");
		month = sc.nextInt();

		String result = "겨울";//디폴트로 겨울을 잡아놔서 봄,여름,가을만 물어보면됨
		//굳이 맨 마지막에 else 겨울을 입력하지 않아도 나머지는 겨울임

		if( month <1 || month>12 ) //잘못된범위로 오류출력해보는 것.
		{
			System.out.println("잘못입력하셨습니다.");
			return; //계절명 확인 프로그램을 다시 출력하는 걸로 돌아가라.
			//1~12만 입력되도록 보장이 된 것.
		}
		
		if( month >=3 && month <=5 )
			result = "봄";
		
		/*사용자가 입력한 month가 4이면 위에서 봄이결정이 되었으므로 굳이 
		아래에서 더 물어보지 않도록 if가 아닌 else if 사용. if로해도 결과는 같지만
		처리과정줄이기*/

		else if( month >=6 && month <=8 )
			result = "여름";
		else if( month >=9 && month <=11 )
			result = "가을";

		System.out.println(month +" 월은" +result+ " 입니다.");
		
	}
}
