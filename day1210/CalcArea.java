//Abbb파일과 같음. 선생님은 스위치를 사용해서 풀어주신것. 
import java.util.Scanner;
class CalcArea 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String type;
		double area=0,width,height,radius; 
		System.out.println("*** 도형 면적 계산 프로그램***");
		System.out.print("도형의 종류를 입력하세요(R:사각형, T:삼각형, C:원) ===>");
		type= sc.next();
		
	
		switch(type) //문자열과 정수에서만 사용가능. 
		{
			case "R": case "r":
			System.out.print("사각형 밑변의 길이를 입력하세요 ===>");
			width= sc.nextDouble();
			System.out.print("사각형의 높이를 입력하세요 ===>");
			height= sc.nextDouble();
			area =  width * height;
			break;

			case "T": case "t":
			System.out.print("삼각형 밑변의 길이를 입력하세요 ===>");
			width= sc.nextDouble();
			System.out.print("삼각형의 높이를 입력하세요 ===>");
			height= sc.nextDouble();
			area =  width * height / 2;
			break;

			case "C": case "c":
			System.out.print("원의 반지름을 입력하세요 ===>");
			radius= sc.nextDouble();
			area =  3.141592 * radius * radius;
			break;
		}
			System.out.println("도형의 면적은 "+ area+ " 입니다.");
	}
}
