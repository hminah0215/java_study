import java.util.Scanner;
class CircleA 
 {
	public static void main(String[] args) 
	{
		int radius,height;
		double volume;

	Scanner sc = new Scanner(System.in);

	System.out.println("원기둥 밑면의 반지름을 입력하시오.");
	radius = sc.nextInt();
	System.out.println("원기둥의 높이를 입력하시오.");
	height = sc.nextInt();
	
	volume= 3.141592 * radius * radius * height;
		
		System.out.println("부피는" +volume + "입니다");

	}
}
