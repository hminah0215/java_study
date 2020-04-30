//학생의 점수를 입력받아 60점 이상이면 '합격'
//그렇지 않으면 "불합격"을 출력

import java.util.Scanner;
class BooleanTest2 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  int score; //학생점수
	  boolean ispass; //합격여부
	  String result; //합격 불합격 저장하는 변수

	  System.out.println("점수를 입력하세요.");
	  score = sc.nextInt();
		ispass = score >= 60; //비교연산자사용

		if(ispass)
			result = "합격";
		else
			result = "불합격";
		
		 System.out.println(result);
	}
}
