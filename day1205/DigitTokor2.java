import java.util.Scanner;
class  DigitTokor2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		String r="";
		try{
			System.out.print("숫자를 입력하시오. ==>");
			n=sc.nextInt();
		}catch(Exception e)
		{
			System.out.println("입력값을 확인하세요");
			return;
		}

		if ( n==0 )
			r="영";
		
		else if ( n==1 )
			r="일";
		
		else if ( n==2 )
			r="이";
		else if ( n==3 )
			r="삼";
		else if ( n==4 )
			r="사";
		else if ( n==5 )
			r="오";
		else if ( n==6 )
			r="육";
		else if ( n==7 )
			r="칠";
		else if ( n==8 )
			r="팔";
		else if ( n==9 )
			r="구";
	else
		{
			System.out.print("잘못된 입력값입니다.");
			
		}
			System.out.print(r);
		}
	}