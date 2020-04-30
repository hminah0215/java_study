import java.util.Scanner;

class Circle{
	public static void main(String []args){

	int r;
	int h;
	double b;
	double pai=3.141592;

	Scanner sc = new Scanner(System.in);

	System.out.println("원기둥 밑면의 반지름을 입력하시오.");
	r = sc.nextInt();
	System.out.println("원기둥의 높이를 입력하시오.");
	h = sc.nextInt();

	b = (pai*r*r)*h;

	System.out.println("부피는" +b + "입니다");
	
	}
}



