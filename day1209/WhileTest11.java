//사용자로부터 내가 원하는 값을 입력받을때까지 계속해서 반복실행할때 쓰임.
//사용자한테 월을 입력받아 마지막날을 출력하는 프로그램 
//입력한 월이 1~12사이의 값이 아니라면 제대로 된 값을 입력받을때까지 반복 실행 

import java.util.Scanner;
class WhileTest11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int month;

		while(true){
			System.out.print("월을 입력하세요 ==>");
			month = sc.nextInt();
			if( month >= 1 && month <= 12){
				break;  //1~12월 사이를 입력받았다면 탈출하세요. while문 탈출.
			}
		
		} //아래 배열은 내일배울것. 
		int []lastday = {31,28,31,30,31,30,31,31,30,31,30,31};
		//lastday[0] 0번째 들어있는 31을 꺼내오려면 0. 
		System.out.println(month + "월은 "+ lastday[month-1]);
	}
}
