//연습) 사용자한테 임의의 정수 N을 입력받아 그 수가 0을 포함한 양수이면 
//		그 수의 100을 더한값을 출력하고"작업종료"를 출력합니다. 
//		그렇지 않다면, 그 수의 제곱을 출력하고 "작업종료"를 출력합니다. 

//실행예) 
//정수를 입력하세요 ==> 5
//105
//작업종료 

// 정수를 입력하세요 ==> -5
//25
//작업종료 

/*import java.util.Scanner;
class  If01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

			int a;
			System.out.print("정수를 입력하세요===>");
			a=sc.nextInt();

			if (a>=0)
			{
				a=a+100;
				System.out.println(a);
				System.out.println("작업종료");
				}
			else
			{			
				a=a*a;
				System.out.println(a);
				System.out.println("작업종료");
			}
	}
}   */

// 선생님 풀이

import java.util.Scanner;
class  If01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

			int n;
			System.out.print("N을 입력 ==>");
			n = sc.nextInt();
		
		 if (n>=0)
			{
				System.out.println(n+100);
				
				}
			else
			{			
				System.out.println(n*n);
				
			}
			System.out.println("작업종료"); //작업종료후 안내문이 같으니 한번만 출력되게.
	}
}


