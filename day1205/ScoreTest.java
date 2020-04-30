//학생의 점수를 입력받아 "수/우/미/양/가를 판별하여 출력 
//다중if문
import java.util.Scanner;
class  ScoreTest
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int score;
		String r; //수우미양가를 담아둘 문자열 변수

		System.out.print("학생의 점수를 입력하세요==>");
		score = sc.nextInt();

		if( score >=90 )
		{
			r="수";
		}
		else if( score >=80 )
		{
			r="우";
		}
		else if( score >=70 )
		{
			r="미";
		}
		else if( score >=60 )
		{
			r="양";
		}
		else 
		{
			r="가";
		}
		System.out.println("결과: " + r);
	}
}
