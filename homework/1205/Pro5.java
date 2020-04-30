
import java.util.Scanner;
class Pro5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int a;

		System.out.println("1부터 10 사이의 번호를 적으시오.");
		a=sc.nextInt();

		if (a==2)
			System.out.println("1등 입니다.");
		else if( a==5 ) 
			System.out.println("2등 입니다.");
		else if( a==7 ) 
			System.out.println("3등 입니다.");
		
		else 
			System.out.println("꽝 다음기회에.");
	}
}
