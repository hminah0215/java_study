//2) 사용자로 부터 임의의 수 N을 입력받아 N이 소수인지 판별하는 프로그램을 작성하세요.
import java.util.Scanner;
class  Two
{
	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);

		int n; //입력받는 값
		int b=0; //결과를 저장하는 변수
		

		System.out.print("임의의 수 N을 입력하세요==>");
		n = sc.nextInt();

		for (int i=1 ; i <=n ; i++)
		{
			if(n %i==0)
			b ++;
		}
		if(b==2) 
			//3은 1,3 5는 1,5 이런식으로 나눠지는 숫자의 수가 2개니까 2
			System.out.println(n+ "은 소수입니다");
		else
			System.out.println(n+ "은 소수가 아닙니다 ");

			
	}
}