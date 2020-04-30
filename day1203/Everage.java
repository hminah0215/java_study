import java.util.Scanner;

class Everage{
	public static void main(String []args){

	int com;
	int clang;
	int eng;
	int math;
	int avg;

	Scanner sc = new Scanner(System.in);
	System.out.println("컴퓨터개론 점수를 입력하세요");
	com = sc.nextInt();
	System.out.println("C언어 프로그래밍 점수를 입력하세요");
	clang = sc.nextInt();
	System.out.println("영어 점수를 입력하세요.");
	eng = sc.nextInt();
	System.out.println("일반 수학 점수를 입력하세요.");
	math = sc.nextInt();
	
	avg =((com+clang+eng+math)/4);

	System.out.println("평균 점수는 "+avg+ "입니다.");
	
	

}
	}