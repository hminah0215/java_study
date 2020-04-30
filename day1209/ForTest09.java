/*
	사용자한테  임의의수 N을 입력받아 그 수가 소수인지 판별하는 프로그램을 작성

	<<실행 예>>
	N을 입력하세요 ==> 7
	7은 소수입니다. 

	<<소수>>
	약수의 수가 2개인 수를 소수라 한다. 1과 자기자신으로만 나누어지는 수
*/


import java.util.Scanner;
class  ForTest09
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,cnt = 0;
		System.out.print("N을 입력하세요===>");
		n=sc.nextInt();

		for(int i=1; i <=n  ; i++ ){
			if( n %i == 0)
				cnt=cnt+1;		
		}
				if (cnt == 2) //1과 자기자신 2개로만 나눠져야 소수니까.
					System.out.println(n + "은 소수입니다.");
				else
					System.out.println(n + "은 소수가 아닙니다.");
	}
}

