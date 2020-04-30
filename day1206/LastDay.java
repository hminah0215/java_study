/* 연습)사용자한테 월을 입력받아 마지막 날을 출력하는 프로그램을 작성.
<실행예>
월을 입력하세요==> 7
7월은 31일까지 있어요! 
<처리조건>
31 : 1/3/5/7/8/10/12
30 : 4/6/9/11
28 : 2 */


import java.util.Scanner;
class  LastDay
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int month;
		String day="28일";
		System.out.println("월을 입력하세요===>");
		month=sc.nextInt();

		if( month <1 || month>12 ) //너는 1~12범위 숫자만 입력해야함.
		{
			System.out.println("잘못입력하셨습니다.");
			return; 
		}

		if(month ==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
				day="31일";
		else if(month==4 || month==6 || month==9 || month==11)
				day="30일";

		System.out.println(month+ "월은 "+day +" 까지 있어요!");
	

	}
}
