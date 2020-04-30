/* 상점에서 하나에 100원인 물건을 판매하고 있다고 가정하자. 
물건을 10개이상 구입하는 고객에게는 10%를 할인해준다고하자. 
사용자가 구입한 물건의 개수를 입력하면 전체 가격이 얼마인지를 계산해주는 프로그램을 
작성하라. 즉 물건의 개수가 10이상이면 10% 할인한 가격으로 계산해야한다. 
if-else문을 사용하라 */

import java.util.Scanner;
class Pro3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		double d;
		
		System.out.print("구입한 물건의 개수를 입력하세요. ==>");
		a=sc.nextInt();
		
		 b=100;
		 c=a*b;
		 d=(a*b)*0.9;
		
		if ( a>=10 )
			System.out.print("전체 가격은 "+d+" 원 입니다." );
		else 
			System.out.print("전체 가격은 "+c+" 원 입니다." );
	}
}
