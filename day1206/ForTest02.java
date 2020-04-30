/*
반복문 연습) 사용자한테 임의의 수 N을 입력받아 1에서 N까지의 합을 누적하여 
			 출력하는 프로그램을 만들어 보세요.
<실행예>
N을 입력하세요.==> 10
1에서 10까지의 합은 __ 입니다. 
*/
import java.util.Scanner;
class ForTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n; //입력받는값
		int sum=0; //결과를 담을 변수, 더하기해도 아무 영향이없는 0을 값으로 준다.

		System.out.print("어디까지 더할까요?");
		n = sc.nextInt();

		for(int i = 1 ; i <= n ; i++  )
		//맨왼쪽은 출발값 ,가운데 최종(만족할)값, 오른쪽은 증감식 i가 얼마씩 증감해야하는지
		//i=i+1 을 i++라고 입력해도 됨.
		{
			sum = sum + i;  
		}
			System.out.println("1에서 " +n+ " 까지의 합은 " +sum+ " 입니다.");
	}

}
