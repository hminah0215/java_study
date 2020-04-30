//java AddTest 2 4 
//2랑 4를 더하기 해달라는 프로그램을 만들려고 한다. 실행시에. 

class  AddTest
{
	public static void main(String[] args)//자바의 메인은 스트링! 어떤 데이터도 받을 수 있게.  
	{
		int a = Integer.parseInt( args[0] ); 
		// Integer.parseInt( "1000"  ) 글자를 숫자로 만들어 주세요. 
		int b =  Integer.parseInt( args[1] );
		 int r = a+ b;
		 System.out.println("더하기 결과 : "+ r);
	}
}
