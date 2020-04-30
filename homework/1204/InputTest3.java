/*
자동차 연비를 계산하는 프로그램을 작성하여보자.
주행거리와 사용한 휘발유양은 실수로 입력받기
연비=주행거리/기름양
 */

import java.util.*;
class InputTest3 
{
	public static void main(String[] args) 
	{
		double joo,hhh,money; //주행거리, 휘발유양,연비

		Scanner in = new Scanner(System.in);

		System.out.println("주행거리는 얼마인가요?");
			joo = in.nextDouble();
		System.out.println("사용한 휘발유양은 얼마나 되나요?");
			hhh = in.nextDouble(); 

			//연비=주행거리/기름양

		money = joo/hhh;

		System.out.println("연비는" +money + "입니다");

		
		

	}
}
