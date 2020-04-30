/*							프로그래밍1번 문제 
간단한 계산기 프로그램을 작성하여보자. 먼저 사용자로부터 하나의 문자를 입력받는다. 
이어서 사용자로부터 2개의 숫자를 입력받는다. 사용자로부터 받은 문자가 '+' 이면 두수의 
덧셈을, 문자가 '-' 이면 뺄셈을, 문자가 '*'이면 곱셈을, 문자가 '/' 이면 나눗셈을 수행하도록
작성하라. if-else 문을 사용하라. 나눗셈의 경우, 분모가 0이 아닌지를 먼저 검사하여야한다.
*/

import java.util.Scanner;
class  CalcTest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String op;
		int a,b;
		double r=0;
		System.out.println("***간단한 계산기***");
		System.out.print("연산자를 입력(+,-,*,/)하세요==>");
		op=sc.next();

		if( !op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) { 
		//더하기가 아니냐. 앞에 ! 부정. +,-,*,/도 아니라면~~ 
		System.out.println("올바른 연산자를 확인하세요.");
		return;
		}

		System.out.print("첫번째 수를 입력하세요 ==>");
		a=sc.nextInt();
		System.out.print("두번째 수를 입력하세요 ==>");
		b=sc.nextInt();

		
		if( op.equals("+") ){   //문자열은 ==으로 같다고 못하고 .equals("문자열")으로 표현
			r = a + b;
		}else if (op.equals("-")){
			r = a - b;
		}else if (op.equals("*")){
			r = a * b;
		}else if (op.equals("/")){
			if ( b  == 0 ){
				System.out.println("0으로 나눌수는 없어요.");
				return;
			}
			r = a / (double) b;
		}
		
		System.out.printf("결과 : %.2f ", r); //소숫점 둘째자리까지 출력되도록. 프린트f ( %.2)
		


	}
}
