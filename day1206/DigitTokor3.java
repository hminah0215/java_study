import java.util.Scanner;

/*switch( 변수나 수식 ) ==> ()에 올수있는 타입 String, Int
{
	case 0 :
	 문장1:

	case 1 :
	문장1:
*/

class  DigitTokor3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		String r="";
		try{
			System.out.print("0~9사이의 정수를 입력하시오. ==>");
			n=sc.nextInt();
		}catch(Exception e)
		{
			System.out.println("입력값을 확인하세요");
			return;
		}

		

		switch(n) //n의 값에 따라서라는 뜻
		{
			case 0: //n이0일때
				r = "영"; //시키고자 할일
				break; //스위치의 중괄호를 탈출.브레이크 안넣으면 어떤숫자를 입력해도 "구"라고나옴.
			
			case 1:r= "일";break; //한줄로써도 상관없음. 문장형식만 잘 맞추면 오케이.
			case 2:r= "이";break;
			case 3:r= "삼";break;
			case 4:r= "사";break;
			case 5:r= "오";break;
			case 6:r= "육";break;
			case 7:r= "칠";break;
			case 8:r= "팔";break;
			case 9:r= "구";break;
			
		}
			System.out.print(r);
		}
	}