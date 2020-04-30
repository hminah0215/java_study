//1) 사용자로 부터 임의의 수 N을 입력받아 N의 약수를 모두 출력하는 프로그램을 작성하세요.
import java.util.Scanner;
class  One
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int n; //입력받는 값
		int div=1; //결과를 저장하는 변수

		System.out.print("임의의 수 N을 입력하세요==>");
		n = sc.nextInt();

		for (int i=n ;i >= 1 ; i-- )
		{
			div =n %i; //나머지를 구하는거고.
		if(div==0) //나머지가 0이면 약수
			System.out.println(i);
		}


	}
}
