class AddTest
{
	public static void main(String[] args) 
	{

		//대문자 'A'와 소문자'a'의 차이를 확인하세요. 
		
		//내가한 방법
		//char A = 'A';
		//char a = 'a';
		//System.out.println(A-a); //차이는 32
		//System.out.println((int)(A+32));//소문자a값은 97
		//선생님이 보여주신 방법	
		int a = (int)'A';
		int b = (int)'a';
		System.out.println(a);
		System.out.println(b);
		System.out.println(b-a);

		
		//char ch = 'A';
		//System.out.println((char)(ch+1));//대문자 B가 출력됨.
		//System.out.println('A'+1); //이렇게 하면 66이 출력됨. 65+1
		//System.out.println('A'+"1"); //이건 A 랑 1 이렇게 출력
		//System.out.println(ch);
		//System.out.println((int)ch); //한글자단위에만 가능함
		//대문자 A값의 코드를 확인할 수 있음. 65나옴.

		//int a = 7+3;
		//String b="7"+"3";//글자끼리연결. 문자열은 스트링. 
		//String c="7" +3; //이건 7 3 이렇게 나옴.
		//7+3+"" <--10으로 출력.연산된 결과를 스트링으로 만듬. 연산먼저하고 꼭 뒤에! 

		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		//System.out.println(7+3);  //10
		//System.out.println("7 "+" 3"); //7 3
		//System.out.println("7 "+ 3); //  7 3


	}
}
