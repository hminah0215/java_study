import java.util.*;

class InputTest1 
{
	public static void main(String[] args) 
	{
		int radius; //반지름
		double vol; //원의 면적
		//반지름으로 면적구하기 공식 면적=파이*반지름의 제곱

		Scanner in = new Scanner(System.in);
		
		System.out.println("원의 반지름을 입력하세요. ");
		radius = in.nextInt();
		
		vol = 3.14 * (radius * radius);
		System.out.println("원의 면적은 " +vol + " 입니다");
		
	
		

	}
}
