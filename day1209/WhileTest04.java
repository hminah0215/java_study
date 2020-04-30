//사용자한테 N을 입력받아 1에서 N까지의 짝수의 합을 누적하여 출력하는 프로그램 
// while문이용

import java.util.Scanner;
class WhileTest04 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;
		int sum=0;
		System.out.print("N을 입력하세요===>");
		n=sc.nextInt();
		
		int i=1;
		while(i <=n ){
			if( i %2 ==0 ){
			sum= sum+i;
		}
		i++;
	}
		System.out.println("1에서 " +n+ "까지의 짝수합:" + sum);
	}
}
