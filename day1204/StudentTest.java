import java.util.Scanner;
class StudentTest
{
	public static void main(String []ars)
	{
		Scanner sc = new Scanner(System.in);
		
		int com,c,eng,math;
		double avg;

	System.out.print("컴퓨터개론 점수를 입력하세요");
	com = sc.nextInt();
	System.out.print("C언어 프로그래밍 점수를 입력하세요");
	c = sc.nextInt();
	System.out.print("영어 점수를 입력하세요.");
	eng = sc.nextInt();
	System.out.print("일반 수학 점수를 입력하세요.");
	math = sc.nextInt();

	avg = (com+c+eng+math)/4.0;

	System.out.println("평균 점수는" +avg+ "점 입니다. ");
	}
}