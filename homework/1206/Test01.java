//1206숙제 5번 lab 4번 선생님풀이

import java.util.Scanner;
class  Test01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		long a = 0, b= 1, c; //꼭 long으로 하지 않아도 됨. 인트도 가능
		int i, n;
		System.out.println("***피보나치 수열 출력 프로그램***");
		System.out.print("몇 항까지 출력할까요?");
		n=sc.nextInt();

		if(n < 3)
		{	
		    System.out.println("적어도 3이상을 입력하세요.");
			return;
		}
		System.out.print(a+" "+b+" ");

		for(i=2; i < n; i++) //여기서i는 반복횟수를 위해 사용하는 변수. 
		//적어도 3번째항부터 수열을 적용할수있어서 i=2라고 출발점을 둠. 

		{
			c  = a+b;	//변수a와 b를 더하여 변수c에 대입한다.
			System.out.print(c+" ");

			a = b;	    //변수b의 값을 변수 a로 옮긴다.
			b = c;	    //변수c의 값을 변수b로 옮긴다.
			

		}
		
	}
}
