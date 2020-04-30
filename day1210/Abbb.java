 /*프로그래밍 2번 문제. 
 사용자로부터 하나의 문자를 입력받아서 문자가 'R'이면 사각형의 면적을 계산하고 
'T'이면 삼각형의 면적을, 'C'이면 원의 면적을 계산한다. 면적을 계산하는데
필요한 숫자들은 사용자로부터 입력받는다. 

사각형 면적= 밑변길이 * 높이
삼각형 면적= 밑변길이 * 높이 /2
원의 면적 = 원주율*반지름*반지름 
*/
import java.util.Scanner;
class  Abbb
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String mun;
		int l,h,d;
		double x=0; //값을 담아둘 변수

		System.out.print("면적을 계산할 도형을 입력하세요(R:사각형, T:삼각형, C:원) ===>");
		mun= sc.next();
		
		if( !mun.equals("R") &&  !mun.equals("T") &&  !mun.equals("C") && 
			 !mun.equals("r") && !mun.equals("t") && !mun.equals("c")) { 
				System.out.println("올바른 입력값을 확인하세요.");
				return;
			}
		
			if( mun.equals ("R") || mun.equals ("r") ){
			System.out.print("사각형 밑변의 길이를 입력하세요 ===>");
			l = sc.nextInt();
			System.out.print("사각형의 높이를 입력하세요 ===>");
			h = sc.nextInt();
			x = l*h;
			}
		
			else if(mun.equals ("T") || mun.equals ("t") ){
			System.out.print("삼각형 밑변의 길이를 입력하세요 ===>");
			l = sc.nextInt();
			System.out.print("삼각형의 높이를 입력하세요 ===>");
			h = sc.nextInt();
			x = ( l*h)/2;
			}

			else if( mun.equals ("C") || mun.equals ("c") ){
			System.out.print("원의 반지름을 입력하세요 ===>");
			d = sc.nextInt();
			x = (d*d*3.14);
			
			}
				System.out.println("입력한 도형의 면적은 "+ x+ " 입니다.");

	}
}
