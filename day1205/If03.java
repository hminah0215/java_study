//선생님 풀이 변수 max 만드는것 If02 파일내용.

import java.util.Scanner;
class  If03

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int a,b,c,max;

		System.out.println("첫번째 정수를 입력하세요.");
		a=sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		b=sc.nextInt();
		System.out.println("세번째 정수를 입력하세요.");
		c=sc.nextInt();
		

		if( a>b )
		{	if( a>c )
			{	
				max=a;
			}
			else 
			{	
				max=c;
			}
		}
		else
		{	if( b>c )
			{		
				max=b;
			}
			else
			{
				max=c;
			}
			}
		System.out.println("가장 큰 수는 "+max+ " 입니다.");
	}
}   
